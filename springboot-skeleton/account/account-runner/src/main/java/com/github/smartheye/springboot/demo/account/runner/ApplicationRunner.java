package com.github.smartheye.springboot.demo.account.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages={"com.github.smartheye.springboot"},
		exclude=DataSourceAutoConfiguration.class)
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
public class ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationRunner.class, args);
	}

}
