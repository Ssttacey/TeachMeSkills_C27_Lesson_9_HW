package com.teachmeskills.lesson9.task3.model.card;

/**
 * the card class contains information about the data and a method for displaying information about the client and his cards
 */

public abstract class Card {
    protected int cardNumber;
    protected int id;
    protected double currentBalance;
    protected int cvv;
    protected int currencyCode;
    protected double commission;

    private static int counter;

    public Card(int cardNumber, double currentBalance, int cvv, int id) {
        this.cardNumber = cardNumber;
        this.currentBalance = currentBalance;
        this.cvv = cvv;
        this.id = id;
    }

    public Card() {
        this.cardNumber = ++counter;
    }

    abstract public int getTransferLimit();


    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }


    public int getCurrencyCode() {
        return currencyCode;
    }

    public double getCommission() {
        return commission;
    }

    public int getId() {
        return id;
    }

    public void showBaseCardInfo() {
        System.out.println("Card " + id + ". " + " amount:  " + currentBalance + ", Commission for transfer: " + getCommission());
    }
}




