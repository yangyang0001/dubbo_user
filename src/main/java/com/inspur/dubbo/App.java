package com.inspur.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ExecutionException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:order-consumer.xml");
        /**
         * 同步的接口测试

        // 模仿用户下单
        OrderService orderService = (OrderService) context.getBean("orderService");
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setName("YangOrder");
        OrderResponse orderResponse = orderService.doOrder(orderRequest);
        System.out.println(orderResponse);
         */

        /**
         * 异步测试
        OrderService orderService = (OrderService) context.getBean("orderService");
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setName("YangOrder");
        orderService.doOrder(orderRequest);

        Future<OrderResponse> future = RpcContext.getContext().getFuture();
        OrderResponse orderResponse = future.get();
        System.out.println(orderResponse);
        */


        //模仿查询
//        OrderQueryService orderQueryService = (OrderQueryService) context.getBean("orderQueryService");
//        System.out.println(orderQueryService.doQuery("YangOrder"));

        /**
         * 模仿负载均衡
         */
//        for(int i = 0; i < 10; i++){
//            OrderService orderService = (OrderService) context.getBean("orderService");
//            OrderRequest orderRequest = new OrderRequest();
//            orderRequest.setName("YangOrder");
//            OrderResponse orderResponse = orderService.doOrder(orderRequest);
//            System.out.println(orderResponse);
//            Thread.currentThread().sleep(1000);
//        }

    }
}
