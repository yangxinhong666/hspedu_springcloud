package com.hspedu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: MemberApplication
 * Package: com.hspedu.springcloud.entity
 * Description:
 *
 * @Author 杨新鸿
 * @Create 2024/07/30 22:26
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.hspedu.springcloud.dao"})
@EnableEurekaClient
public class MemberProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberProviderApplication.class, args);
    }
}
