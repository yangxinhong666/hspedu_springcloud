package com.hspedu.springcloud.controller;

import com.hspedu.springcloud.entity.Member;
import com.hspedu.springcloud.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * ClassName: MemberConsumerController
 * Package: com.hspedu.springcloud.controller
 * Description:
 *
 * @Author 杨新鸿
 * @Create 2024/07/31 21:54
 * @Version 1.0
 */
@RestController
@Slf4j
public class MemberConsumerController {
    public static final String MEMBER_SERVICE_PROVIDER_URL = "http://localhost:10001";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/member/consumer/save")
    public Result<?> save(@RequestBody Member member) {
        return restTemplate.postForObject(MEMBER_SERVICE_PROVIDER_URL
                + "/member/save", member, Result.class);
    }

    @GetMapping("/member/consumer/get/{id}")
    public Result<?> getMemberById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(MEMBER_SERVICE_PROVIDER_URL
                + "/member/get/" + id, Result.class);
    }
}
