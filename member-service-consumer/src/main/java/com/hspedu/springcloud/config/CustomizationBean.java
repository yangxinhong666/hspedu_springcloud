package com.hspedu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: CustomizationBean
 * Package: com.hspedu.springcloud.config
 * Description:
 *
 * @Author 杨新鸿
 * @Create 2024/07/31 21:53
 * @Version 1.0
 */
@Configuration
public class CustomizationBean {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
