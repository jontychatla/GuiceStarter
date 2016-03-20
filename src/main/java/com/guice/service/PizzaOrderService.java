package com.guice.service;

import com.google.inject.Inject;
import com.guice.model.CreditCard;
import com.guice.model.Order;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

public class PizzaOrderService {

    private BillingService billingService;

    @Inject
    public PizzaOrderService(BillingService billingService) {
        this.billingService = billingService;
    }

    public void order(Order order, CreditCard creditCard) {
        double billingAmount = calcualteBillAmount(order);
        billingService.chargeCreditCard(creditCard, billingAmount);
        System.out.println("Ordered Placed successfully");
    }

    private double calcualteBillAmount(Order order) {
        //dummy total
        return 100.0;
    }

}
