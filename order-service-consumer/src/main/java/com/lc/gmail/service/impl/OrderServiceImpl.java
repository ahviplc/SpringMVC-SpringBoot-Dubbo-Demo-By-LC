package com.lc.gmail.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lc.gmall.bean.UserAddress;
import com.lc.gmall.service.OrderService;
import com.lc.gmall.service.UserService;

/**
 * 1. 将服务提供者注册到注册中心(暴露服务)
 *   1.1 导入dubbo依赖（2.6.2）和操作zookeeper的客户端【curator】
 *   1.2  配置服务提供者
 *   
 * 2. 让服务消费者去注册中心订阅服务提供者的服务地址
 * 
 * @author LC
 * 2019年8月13日14:09:52
 * 
    *  其他：
    *  【import org.springframework.stereotype.Service;】 
    *  【import com.alibaba.dubbo.config.annotation.Service;】 
 *
 */

 @Service 
public class OrderServiceImpl implements OrderService {

	@Autowired
	UserService userService;

	public void initOrder(String userId) {
		// TODO Auto-generated method stub
		System.out.println("用户id:"+userId);
		// 1.查询用户的收货地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		// System.out.println(addressList);
		for (UserAddress userAddress : addressList) {
			System.out.println(userAddress.getUserAddress());
		}
	}

	@Override
	public List<UserAddress> initOrder2AndReturnList(String userId) {
		// TODO Auto-generated method stub
		System.out.println("boot-用户id:" + userId);
		// 1.查询用户的收货地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		return addressList;
	}

}
