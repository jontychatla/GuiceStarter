package com.guice.module;

import com.google.inject.AbstractModule;
import com.guice.service.BillingService;
import com.guice.service.PaypalBillingService;

public class BillingModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(BillingService.class).to(PaypalBillingService.class);
    }
}
