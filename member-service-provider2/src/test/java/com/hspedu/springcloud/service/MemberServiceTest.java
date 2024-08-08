package com.hspedu.springcloud.service;

import com.hspedu.springcloud.entity.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: MemberServiceTest
 * Package: com.hspedu.springcloud.service
 * Description:
 *
 * @Author 杨新鸿
 * @Create 2024/07/31 21:24
 * @Version 1.0
 */
@SpringBootTest
@Slf4j
public class MemberServiceTest {
    @Autowired
    private MemberService memberService;

    @Test
    public void testQueryMemberById() {
        Member member = memberService.queryMemberById(1L);
        System.out.println(member);
    }

    @Test
    public void testSave() {
        Member member1 = new Member();
        member1.setName("yang1");
        member1.setPwd("1234561");
        member1.setMobile("183847416461");
        member1.setEmail("1234561@qq.com");
        member1.setGender(1);

        int member = memberService.save(member1);
        if (member != 0) {
            System.out.println("插入成功！");
        } else {
            System.out.println("插入失败！");
        }
    }

}
