package com.hspedu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: Member
 * Package: com.hspedu.springcloud.entity
 * Description:
 *
 * @Author 杨新鸿
 * @Create 2024/07/30 22:37
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member implements Serializable {
    private static final long serialVersionUID = 6609718755239807404L;
    private Long id;
    private String name;
    private String pwd;
    private String mobile;
    private String email;
    private Integer gender;
}
