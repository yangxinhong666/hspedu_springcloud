package com.hspedu.springcloud.dao;

import com.hspedu.springcloud.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: dao
 * Package: com.hspedu.springcloud
 * Description:
 *
 * @Author 杨新鸿
 * @Create 2024/07/31 21:06
 * @Version 1.0
 */
@SpringBootTest
public class MemberDaoTest {
    @Autowired
    private MemberDao memberDao;

    @Test
    public void testQueryMemberById() {
        Member member = memberDao.queryMemberById(1L);
        System.out.println(member);
    }

    @Test
    public void testSave() {
        Member member1 = new Member();
        member1.setName("yang");
        member1.setPwd("123456");
        member1.setMobile("18384741646");
        member1.setEmail("123456@qq.com");
        member1.setGender(1);

        int member = memberDao.save(member1);
        if (member != 0) {
            System.out.println("插入成功！");
        } else {
            System.out.println("插入失败！");
        }
    }
}
