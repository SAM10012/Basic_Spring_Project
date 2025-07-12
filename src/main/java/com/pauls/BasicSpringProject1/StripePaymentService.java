package com.pauls.BasicSpringProject1;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amt){
        System.out.println("STRIPE");
        System.out.println("Amount: " + amt);
    }
}
