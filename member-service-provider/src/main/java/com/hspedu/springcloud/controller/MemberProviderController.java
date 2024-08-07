package com.hspedu.springcloud.controller;

import com.hspedu.springcloud.entity.Member;
import com.hspedu.springcloud.entity.Result;
import com.hspedu.springcloud.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * ClassName: MemberController
 * Package: com.hspedu.springcloud.controller
 * Description:
 *
 * @Author 杨新鸿
 * @Create 2024/07/31 21:27
 * @Version 1.0
 */
@RestController
@Slf4j
public class MemberProviderController {
    @Resource
    private MemberService memberService;

    @GetMapping("/member/get/{id}")
    public Result<?> getMemberById(@PathVariable("id") long id) {
        Member member = memberService.queryMemberById(id);
        if (member != null) {
            return Result.success(member);
        } else {
            return Result.error("402", "ID=" + id + "不存在");
        }
    }

    @PostMapping("/member/save")
    public Result<?> save(@RequestBody Member member) {
        int result = memberService.save(member);
        log.info("reset= " + result);
        if (result > 0) { //成功
            return Result.success(result);
        } else {
            return Result.error("401", "添加用户失败");
        }
    }
}
