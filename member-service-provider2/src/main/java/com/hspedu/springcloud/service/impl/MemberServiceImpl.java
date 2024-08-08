package com.hspedu.springcloud.service.impl;

import com.hspedu.springcloud.dao.MemberDao;
import com.hspedu.springcloud.entity.Member;
import com.hspedu.springcloud.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName: MemberServiceImpl
 * Package: com.hspedu.springcloud.service.impl
 * Description:
 *
 * @Author 杨新鸿
 * @Create 2024/07/31 21:23
 * @Version 1.0
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberDao memberDao;

    @Override
    public Member queryMemberById(long id) {
        return memberDao.queryMemberById(id);
    }

    @Override
    public int save(Member member) {
        return memberDao.save(member);
    }

}
