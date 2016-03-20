package com.guice.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.model.CreditCard;
import com.guice.model.Order;
import com.guice.model.Pizza;
import com.guice.module.BillingModule;
import com.guice.service.PizzaOrderService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Injector injector= Guice.createInjector(new BillingModule());
        PizzaOrderService pizzaOrderService = injector.getInstance(PizzaOrderService.class);
        Pizza p1 = new Pizza("Chicken", "12", Arrays.asList("Olives"));
        Order order = new Order(Arrays.asList(p1));
        CreditCard creditCard = new CreditCard("Foo", "Foo Address","1111-1111-1111-1111", "12/20");
        pizzaOrderService.order(order, creditCard);
    }
}
