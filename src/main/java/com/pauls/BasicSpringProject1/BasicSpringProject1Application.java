package com.pauls.BasicSpringProject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicSpringProject1Application {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(BasicSpringProject1Application.class, args);
        OrderService orderService = context.getBean(OrderService.class);
        // Way 1: Constructor Injection
        // var orderService = new OrderService(new PaypalPaymentService());


        // Way 2: Setter Injection
       // OrderService orderService = new OrderService();
        //orderService.setPaymentService(new PaypalPaymentService());
        orderService.placeOrder();
	}

}
