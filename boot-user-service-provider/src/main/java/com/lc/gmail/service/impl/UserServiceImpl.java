package com.lc.gmail.service.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import com.lc.gmall.bean.UserAddress;
import com.lc.gmall.service.UserService;

/**
 * 
 * @author LC
 * 
 * 【import org.springframework.stereotype.Service;】
 * 【import org.apache.dubbo.config.annotation.Service;】
 * 
 * 【import com.alibaba.dubbo.config.annotation.Service; 删除了 不使用了】
 */
@Service //暴露服务
@Component
public class UserServiceImpl implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		System.out.println("【boot-user-service-provider/com.lc.gmail.service.impl.UserServiceImpl.getUserAddressList()】");
		UserAddress address1 = new UserAddress(1, "boot-上海徐汇区", "1", "shviplc", "110", "Y");
		UserAddress address2 = new UserAddress(2, "boot-安徽亳州市", "1", "ahviplc", "120", "Y");
		return Arrays.asList(address1, address2);
	}

}
