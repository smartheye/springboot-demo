package com.github.smartheye.springboot.demo.account.service.impl;

import org.springframework.stereotype.Service;

import com.github.smartheye.springboot.demo.account.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{


	@Override
	public String helloWorld() {
		System.out.println("helloWorld");
		return "helloWorld";
	}
}
