package com.lc.gmall;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * main方法
 * @author LC
 *
 */
public class MainApplication {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
		ioc.start();
		System.out.println("user-service-provider 我已经启动了");
		System.in.read();//阻塞进程
	}

}
