package com.guice.service;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;
import com.guice.model.CreditCard;
import com.guice.model.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PizzaOrderServiceTest {

    @Mock BillingService billingService;

    @Test
    public void testPizzaOrder() throws Exception {
        PizzaOrderService pizzaOrderService = new PizzaOrderService(billingService);
        pizzaOrderService.order(any(Order.class), any(CreditCard.class));
        verify(billingService, times(1)).chargeCreditCard(any(CreditCard.class), anyDouble());
    }
}