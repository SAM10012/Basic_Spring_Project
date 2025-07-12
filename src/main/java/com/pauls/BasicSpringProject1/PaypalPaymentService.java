package com.pauls.BasicSpringProject1;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService{
    @Override
    public void processPayment(double amt) {
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amt);
    }
}
