package com.example.Spring_Store;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL DEMO");
        System.out.println("Amount: " + amount);
    }
}
