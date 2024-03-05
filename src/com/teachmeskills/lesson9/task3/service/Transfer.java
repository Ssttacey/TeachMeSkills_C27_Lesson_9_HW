package com.teachmeskills.lesson9.task3.service;

import com.teachmeskills.lesson9.task3.constant.CurrencyCode;
import com.teachmeskills.lesson9.task3.constant.CurrencyExchange;
import com.teachmeskills.lesson9.task3.fabric.CreateClient;
import com.teachmeskills.lesson9.task3.model.card.Card;
import com.teachmeskills.lesson9.task3.model.client.Client;

/**
 * contains two methods. one requests card numbers for transfer, the second method contains the logic for making transfers
 */

public class Transfer {

    public static Card finder(Card[] cards, int id) {
        Card find = null;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].getId() == id) {
                find = cards[i];
                break;
            }
        }
        if (find == null) {
            System.out.println("the selected card does not exist ");
        }
        return find;
    }

    public static void transferFromCardToCard(Card cardFrom, Card cardTo, double amount) {
        CreateClient.createClient();
        Client.showClientData();

        if (amount < cardFrom.getTransferLimit()) {
            System.out.println(" limit exceeded ");
        } else if (amount > cardFrom.getCurrentBalance()) {
            System.out.println("insufficient funds ");
        } else {
            double newCardFromBalance = cardFrom.getCurrentBalance() - amount - (amount * cardFrom.getCommission());

            if (cardFrom.getCurrencyCode() == CurrencyCode.BYN_CURRENCY_CODE
                    && !(cardTo.getCurrencyCode() == CurrencyCode.BYN_CURRENCY_CODE)) {
                amount *= CurrencyExchange.BUN_TO_USD;
            } else if (cardFrom.getCurrencyCode() == CurrencyCode.USD_CURRENCY_CODE
                    && !(cardTo.getCurrencyCode() == CurrencyCode.USD_CURRENCY_CODE)) {
                amount *= CurrencyExchange.USD_TO_BYN;
            }

            double newCardToBalance = cardTo.getCurrentBalance() + amount;

            System.out.println("Information about cards now:");
            cardFrom.showBaseCardInfo();
            cardTo.showBaseCardInfo();
            System.out.println();
            System.out.println(" the translation was completed successfully. amount on card : ");
            cardFrom.setCurrentBalance(newCardFromBalance);
            cardTo.setCurrentBalance(newCardToBalance);
            System.out.println();
            cardFrom.showBaseCardInfo();
            cardTo.showBaseCardInfo();

        }
    }
}
