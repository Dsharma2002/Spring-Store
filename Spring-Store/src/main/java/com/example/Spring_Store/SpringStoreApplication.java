package com.example.Spring_Store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringStoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringStoreApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        // var orderService = new OrderService();
        // orderService.setPaymentService(new PaypalPaymentService());
        orderService.placeOrder();
    }
}
