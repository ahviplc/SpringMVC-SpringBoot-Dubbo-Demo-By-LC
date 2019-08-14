package com.lc.gmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 *  
 * 1. 导入依赖
 *    1.1 导入dubbo-starter 
 *    1.2 导入dubbo的其他依赖
 * 
 * @author LC
 * @dateTime 2019年8月14日09:15:06
 * 
 * 【import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;】
 * 【import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo; 删除了 不使用了】
 *
 */

@EnableDubbo //开启基于注解的dubbo功能
@SpringBootApplication
public class BootUserServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserServiceProviderApplication.class, args);
		System.out.println("boot-user-service-provider 我已经启动了");
	}

}
