package com.hspedu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: MemberConsumerApplication
 * Package: com.hspedu.springcloud
 * Description:
 *
 * @Author 杨新鸿
 * @Create 2024/07/31 21:51
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class MemberConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberConsumerApplication.class, args);
    }
}
