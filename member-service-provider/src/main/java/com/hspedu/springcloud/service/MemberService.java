package com.hspedu.springcloud.service;

import com.hspedu.springcloud.entity.Member;

/**
 * ClassName: MemberService
 * Package: com.hspedu.springcloud.service
 * Description:
 *
 * @Author 杨新鸿
 * @Create 2024/07/31 21:22
 * @Version 1.0
 */
public interface MemberService {
    Member queryMemberById(long id);

    int save(Member member);
}
