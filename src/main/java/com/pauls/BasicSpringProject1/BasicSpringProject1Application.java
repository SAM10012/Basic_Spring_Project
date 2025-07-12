package com.pauls.BasicSpringProject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicSpringProject1Application {

	public static void main(String[] args) {

        //SpringApplication.run(BasicSpringProject1Application.class, args);

        // Way 1: Constructor Injection
        // var orderService = new OrderService(new PaypalPaymentService());


        // Way 2: Setter Injection
        var orderService = new OrderService();
        orderService.setPaymentService(new PaypalPaymentService());
        orderService.placeOrder();
	}

}
