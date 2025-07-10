package com.example.Spring_Store;

public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        // PaymentService paymentService = new StripePaymentService();
        Double payment = 100.0;
        paymentService.processPayment(payment);

    }

}
