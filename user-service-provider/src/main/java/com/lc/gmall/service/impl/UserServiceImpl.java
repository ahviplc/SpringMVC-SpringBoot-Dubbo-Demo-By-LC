package com.lc.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.lc.gmall.bean.UserAddress;
import com.lc.gmall.service.UserService;

public class UserServiceImpl implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		System.out.println("【user-service-provider/com.lc.gmall.service.impl.UserServiceImpl.getUserAddressList()】");
		UserAddress address1 = new UserAddress(1, "上海徐汇区", "1", "shviplc", "110", "Y");
		UserAddress address2 = new UserAddress(2, "安徽亳州市", "1", "ahviplc", "120", "Y");
		return Arrays.asList(address1, address2);
	}

}
