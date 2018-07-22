package com.github.smartheye.springboot.demo.account.testconfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@TestConfiguration
@ImportResource({
	"classpath*:/spring/applicationContext*.xml",
	"classpath*:/mq/mq*.xml",
	"classpath*:/mq/applicationContext*.xml",
	"classpath*:/ws/applicationContext*.xml",
	"classpath*:/redis/applicationContext*.xml",
})
@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableAsync
@EnableCaching
@EnableTransactionManagement
@MapperScan("com.github.smartheye.springboot.demo.account.dal.mapper")
public class TestConfig implements WebMvcConfigurer {

}
