package com.github.smartheye.springboot.demo.account.runner.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan("com.github.smartheye.springboot.demo.account.dal.mapper")
public class DalConfig {

}
