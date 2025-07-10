package com.example.Spring_Store;

public class StripePaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE DEMO");
        System.out.println("Amount: " + amount);
    }
}
