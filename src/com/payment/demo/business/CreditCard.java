package com.payment.demo.business;


import com.payment.demo.service.MoneyService;
import com.payment.demo.service.PaymentService;

public class CreditCard implements MoneyService, PaymentService {


    private final String ID;
    private double balance;

    public CreditCard(double balance) {
        this.ID = "M1:"+ Math.random() * 2.45 +"" + Math.random() * 30;
        this.balance = balance;
    }

    @Override
    public double pay(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    public double addMoney(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double getBalance(){
        return this.balance;
    }



}
