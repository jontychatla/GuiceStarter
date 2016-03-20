package com.guice.service;

import com.guice.model.CreditCard;

public class PaypalBillingService implements BillingService {

    public void chargeCreditCard(CreditCard card, double billAmount) {
        System.out.println("Charged amount successfully");
    }
}
