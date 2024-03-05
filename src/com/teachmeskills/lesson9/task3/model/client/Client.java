package com.teachmeskills.lesson9.task3.model.client;

import com.teachmeskills.lesson9.task3.model.card.Card;

/**
 * the client class contains information about the client, stores data about objects
 */
public class Client {

    private static String fullName;
    private String passportNumber;
    private String birthday;
    private String country;
    private String address;
    private static Card[] cards;


    public Client(String fullName, String passportNumber, String birthday, String country, String address, Card[] cards) {
        this.fullName = fullName;
        this.passportNumber = passportNumber;
        this.birthday = birthday;
        this.country = country;
        this.address = address;
        this.cards = cards;
    }

    public static void showClientData() {
        System.out.println(
                getFullName() + " " + "\n" + "Cards in stock: " + showCardLength()
        );
    }

    public static Card[] getCards() {
        return cards;
    }

    public static int showCardLength() {
        return getCards().length;
    }

    public static String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
}

