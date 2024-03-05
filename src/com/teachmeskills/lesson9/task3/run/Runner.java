package com.teachmeskills.lesson9.task3.run;

import com.teachmeskills.lesson9.task3.model.card.Card;

import java.util.Scanner;

import static com.teachmeskills.lesson9.task3.fabric.CreateClient.createClient;
import static com.teachmeskills.lesson9.task3.service.Transfer.finder;
import static com.teachmeskills.lesson9.task3.service.Transfer.transferFromCardToCard;

/**
 * contains a method to run the program
 */

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("select the card from which you will make the transfer ");
        int idCardFrom = scanner.nextInt();
        Card CardFrom = finder(createClient().getCards(), idCardFrom);

        System.out.println("select the card to which you want to transfer money ");
        int idCardTo = scanner.nextInt();
        Card CardTo = finder(createClient().getCards(), idCardTo);

        System.out.println("enter the transfer amount ");
        double transferAmount = scanner.nextDouble();

        transferFromCardToCard(CardFrom, CardTo, transferAmount);

        scanner.close();

    }
}
