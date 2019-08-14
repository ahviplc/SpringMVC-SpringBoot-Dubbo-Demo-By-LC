# order-service-consumer 服务消费者
# Springmvc boot Dubbo 搭建记录 By LC

## 1:这样操作:
 
 如果未开启服务提供者,run服务消费者的
【/order-service-consumer/src/main/java/com/lc/gmail/MainApplication.java】

会报以下异常信息:

【Caused by: java.lang.IllegalStateException: Failed to check the status of the service com.lc.gmall.service.UserService. No provider available for the service com.lc.gmall.service.UserService from the url zookeeper://127.0.0.1:2181/com.alibaba.dubbo.registry.RegistryService?application=order-service-consumer&dubbo=2.6.2&interface=com.lc.gmall.service.UserService&methods=getUserAddressList&pid=9192&register.ip=192.168.0.16&side=consumer&timestamp=1565750954009 to the consumer 192.168.0.16 use dubbo version 2.6.2
】

## 2：此springmvc与dubbo集成的pom.xml,Dubbo 2.6.2,curator-framework 2.12.0,ok的，已经测试！~ LC 2019年8月14日11:00:26

## 3：访问整个springmvcboot与dubbo的步骤记录：

3.1 启动服务注册中心与发现的zookeeper的服务 默认端口【2181】

3.2 首先run服务提供者的 main方法:
【/user-service-provider/src/main/java/com/lc/gmall/MainApplication.java】

3.3 再run服务消费者的main方法:
【/order-service-consumer/src/main/java/com/lc/gmail/MainApplication.java】

3.4 run完之后,即走完整个流程

```
log4j:WARN No appenders could be found for logger (org.springframework.core.env.StandardEnvironment).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
用户id:1
上海徐汇区
安徽亳州市
调用完成......
```

## 4：about me：

**欢迎来到 [LC博客-一加壹博客最Top](http://www.oneplusone.vip)**

**欢迎来到 [LC-Gitlab](https://gitlab.com/ahviplc)**

**欢迎来到 [LC-Github](https://github.com/ahviplc)**

**欢迎来到 [LC-Github-SpringMVC-SpringBoot-Dubbo-Demo-By-LC](https://github.com/ahviplc/SpringMVC-SpringBoot-Dubbo-Demo-By-LC)**

> ### LC最寄语：永远不要放弃自己心中最初的最初的理想！~LC

> from **2019年8月14日11:00:52**

> to **future**
