package com.springboot.project.solarpro.dao;

import com.springboot.project.solarpro.model.UserInfo;
import org.springframework.stereotype.Repository;

@Repository("userInfoMapper")
public interface UserInfoMapper {
    UserInfo selectById(Integer id);
}
