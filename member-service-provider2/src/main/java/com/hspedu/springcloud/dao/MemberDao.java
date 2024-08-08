package com.hspedu.springcloud.dao;

import com.hspedu.springcloud.entity.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: MemberDao
 * Package: com.hspedu.springcloud.dao
 * Description:
 *
 * @Author 杨新鸿
 * @Create 2024/07/30 22:39
 * @Version 1.0
 */
@Mapper
public interface MemberDao {
    Member queryMemberById(long id);

    int save(Member member);
}
