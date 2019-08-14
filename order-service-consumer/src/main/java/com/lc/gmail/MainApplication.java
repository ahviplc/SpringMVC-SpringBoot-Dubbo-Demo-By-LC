package com.lc.gmail;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lc.gmall.service.OrderService;

public class MainApplication {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
		
		OrderService orderService= applicationContext.getBean(OrderService.class);
		
		orderService.initOrder("1");
		
		System.out.println("调用完成......");
		
		System.in.read();//阻塞进程
	}

}
