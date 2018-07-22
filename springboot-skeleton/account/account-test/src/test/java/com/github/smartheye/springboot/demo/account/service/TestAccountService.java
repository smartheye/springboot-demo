package com.github.smartheye.springboot.demo.account.service;

import static org.junit.Assert.*;

import org.junit.runners.MethodSorters;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.smartheye.springboot.demo.account.dal.domain.auto.Account;
import com.github.smartheye.springboot.demo.account.dal.mapper.auto.AccountMapper;
import com.github.smartheye.springboot.demo.account.runner.ApplicationRunner;
import com.github.smartheye.springboot.demo.account.testconfig.TestConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {ApplicationRunner.class, TestConfig.class}, properties= {"spring.config.name=application"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Profile("test")
public class TestAccountService {

	@Autowired
	AccountService accountService;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHelloWorld() {
		String ret = accountService.helloWorld();
		System.out.println(ret);
	}

}
