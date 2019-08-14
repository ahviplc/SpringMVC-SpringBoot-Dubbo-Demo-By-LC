# boot-order-service-consumer 服务消费者
# Springboot Dubbo 搭建记录 By LC

## 1:这样操作:
 
 如果未开启服务提供者,run服务消费者的
【/boot-order-service-consumer/src/main/java/com/lc/gmail/BootOrderServiceConsumerApplication.java】

会报以下异常信息:

【Caused by: java.lang.IllegalStateException: Failed to check the status of the service com.lc.gmall.service.UserService. No provider available for the service com.lc.gmall.service.UserService from the url zookeeper://127.0.0.1:2181/org.apache.dubbo.registry.RegistryService?anyhost=true&application=boot-order-service-consumer&bean.name=ServiceBean:com.lc.gmall.service.UserService&check=false&deprecated=false&dubbo=2.0.2&dynamic=true&generic=false&interface=com.lc.gmall.service.UserService&lazy=false&methods=getUserAddressList&pid=8736&qos.enable=false&register=true&register.ip=192.168.0.16&release=2.7.3&remote.application=user-service-provider&side=consumer&sticky=false&timestamp=1565749558729 to the consumer 192.168.0.16 use dubbo version 2.7.3
】

## 2：此springboot与dubbo集成的pom.xml是最新的，也是对的，已经测试！~ LC 2019年8月14日10:32:50

## 3：访问整个springboot与dubbo的步骤记录：

3.1 启动服务注册中心与发现的zookeeper的服务 默认端口【2181】

3.2 首先run服务提供者的 main方法:
【/boot-user-service-provider/src/main/java/com/lc/gmail/BootUserServiceProviderApplication.java】

3.3 再run服务消费者的main方法:
【/boot-order-service-consumer/src/main/java/com/lc/gmail/BootOrderServiceConsumerApplication.java】

3.4 浏览器打开 访问
> http://localhost:8081/initOrder?uid=1

返回json数据：

```
[
    {
        "id": 1,
        "userAddress": "boot-上海徐汇区",
        "userId": "1",
        "consignee": "shviplc",
        "phoneNum": "110",
        "isDefault": "Y"
    },
    {
        "id": 2,
        "userAddress": "boot-安徽亳州市",
        "userId": "1",
        "consignee": "ahviplc",
        "phoneNum": "120",
        "isDefault": "Y"
    }
]
```

## 4：about me：

**欢迎来到 [LC博客-一加壹博客最Top](http://www.oneplusone.vip)**

**欢迎来到 [LC-Gitlab](https://gitlab.com/ahviplc)**

**欢迎来到 [LC-Github](https://github.com/ahviplc)**

**欢迎来到 [LC-Github-SpringMVC-SpringBoot-Dubbo-Demo-By-LC](https://github.com/ahviplc/SpringMVC-SpringBoot-Dubbo-Demo-By-LC)**

> ### LC最寄语：永远不要放弃自己心中最初的最初的理想！~LC

> from **2019年8月14日10:51:20**

> to **future**
