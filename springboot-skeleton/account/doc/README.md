# SpringBoot示范工程
## 工程说明

该工程是一个整合SpringBoot,MyBatis,Dubbo以及log4j2的基本工程脚手架
版本号为
* SpringBoot 2.0.3.RELEASE
* mybatis 3.4.6
* mybatis-spring 1.3.2
* mybatis-spring-boot-starter 1.3.2
* dubbo-spring-boot-starter 2.0.0
* dubbo 2.6.0

## 安装前提
### 软件安装
* Java 8
* MySQL 5.7.20
* eclipse 4.8 Photon Release
* eclipse Spring IDE Plugin (Optional)

### 数据库脚本
```
CREATE TABLE `t_account` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ACCOUNT_ID` varchar(24) NOT NULL,
  `CUSTOMER_ID` varchar(24) DEFAULT NULL,
  `ACCOUNT_TYPE` char(2) DEFAULT NULL,
  `BALANCE` decimal(10,0) DEFAULT NULL,
  `AVAILABLE_BALANCE` decimal(10,0) DEFAULT NULL,
  `CREATE_BY` varchar(45) NOT NULL,
  `CREATE_TIME` datetime NOT NULL,
  `UPDATE_BY` varchar(45) DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `IDX_ACCOUNT_ID` (`ACCOUNT_ID`),
  UNIQUE KEY `IDX_CUSTOMER_ID` (`CUSTOMER_ID`,`ACCOUNT_TYPE`),
  KEY `IDX_CREATE_TIME` (`CREATE_TIME`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8
```

### 修改配置
打开account-management-runner/src/main/resources/datasource.properties
修改
<p>
* account-management.db.url
* account-management.username
* account-management.password
</p>
为本地数据库的值

## 启动

<p>
启动类为com.github.smartheye.springboot.demo.account.runner.ApplicationRunner<br>
若启动日志最后显示为
</p>

```
2018-07-22 19:07:35.386  INFO 1836 --- [  restartedMain] o.s.c.s.DefaultLifecycleProcessor        : Starting beans in phase 2147483647
2018-07-22 19:07:35.386  INFO 1836 --- [  restartedMain] o.s.s.q.SchedulerFactoryBean             : Starting Quartz Scheduler now
2018-07-22 19:07:35.387  INFO 1836 --- [  restartedMain] o.q.c.QuartzScheduler                    : Scheduler quartzScheduler_$_NON_CLUSTERED started.
2018-07-22 19:07:35.456  INFO 1836 --- [  restartedMain] o.s.b.w.e.t.TomcatWebServer              : Tomcat started on port(s): 9090 (http) with context path ''
2018-07-22 19:07:35.458  INFO 1836 --- [  restartedMain] c.g.s.s.d.a.r.ApplicationRunner          : Started ApplicationRunner in 7.719 seconds (JVM running for 9.329)
```
则表示正常启动