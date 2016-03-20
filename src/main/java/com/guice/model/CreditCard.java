package com.guice.model;

public class CreditCard {

    private String name;
    private String address;
    private String cardNumber;
    private String expiration;

    public CreditCard(String name, String address, String cardNumber, String expiration) {
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
        this.expiration = expiration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }
}
