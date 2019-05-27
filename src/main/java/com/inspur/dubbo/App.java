package com.inspur.dubbo;

import com.inspur.dubbo.entity.OrderRequest;
import com.inspur.dubbo.entity.OrderResponse;
import com.inspur.dubbo.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:order-consumer.xml");

        //模仿用户下单
        OrderService orderService = (OrderService) context.getBean("orderService");

        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setName("YangOrder");
        OrderResponse orderResponse = orderService.doOrder(orderRequest);


        //默认情况下,本地的Service 和
        System.out.println(orderResponse);
    }
}
