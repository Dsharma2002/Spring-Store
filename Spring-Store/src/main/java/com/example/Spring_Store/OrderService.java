package com.example.Spring_Store;

public class OrderService {

    public void placeOrder() {
        PaymentService paymentService = new StripePaymentService();
        paymentService.processPayment(100.0);
    }

}
