package com.pauls.BasicSpringProject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        //var paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }


    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
