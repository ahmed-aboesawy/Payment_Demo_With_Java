package com.payment.demo.models;

import com.payment.demo.business.CreditCard;

public class Customer {
    private final String name;
    private String address;
    private CreditCard card;

    public Customer(String name, String address, CreditCard card) {
        this.name = name;
        this.address = address;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }
}
