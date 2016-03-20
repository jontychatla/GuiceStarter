package com.guice.service;

import com.guice.model.CreditCard;

public interface BillingService {
    void chargeCreditCard(CreditCard card, double billAmount);
}
