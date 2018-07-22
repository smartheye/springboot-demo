package com.github.smartheye.springboot.demo.account.dal;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.runners.MethodSorters;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.github.smartheye.springboot.demo.account.dal.domain.auto.Account;
import com.github.smartheye.springboot.demo.account.dal.mapper.auto.AccountMapper;
import com.github.smartheye.springboot.demo.account.runner.ApplicationRunner;
import com.github.smartheye.springboot.demo.account.testconfig.TestConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {ApplicationRunner.class, TestConfig.class}, properties= {"spring.config.name=application"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Profile("test")
public class TestAccountMapper {

	@Autowired
	AccountMapper accountMapper;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Transactional
	@Rollback
	public void testSelectPrimaryKey() {
		Account inserted = new Account();
		inserted.setAccountId("testAccount001");
		inserted.setAccountType("00");
		inserted.setCustomerId("testCustomerId001");
		inserted.setBalance(BigDecimal.ZERO);
		inserted.setAvailableBalance(BigDecimal.ZERO);
		inserted.setCreateBy("SYSTEM");
		inserted.setCreateTime(new Date());
		int cnt = accountMapper.insert(inserted);
		assertEquals(cnt, 1);
		Account acc = accountMapper.selectByAccountId("testAccount001");
		//Account acc = accountMapper.selectByPrimaryKey(1);
		System.out.println(acc);
	}

}
