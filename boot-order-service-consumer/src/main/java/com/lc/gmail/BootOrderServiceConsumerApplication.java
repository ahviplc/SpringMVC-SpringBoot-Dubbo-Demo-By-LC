package com.lc.gmail;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author LC
 * 
 * 【import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;】
 * 【import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo; 删除了 不使用了】
 */

@EnableDubbo //开启基于注解的dubbo功能
@SpringBootApplication
public class BootOrderServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootOrderServiceConsumerApplication.class, args);
	}

}
