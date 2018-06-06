package com.springboot.project.solarpro.dao;

import com.springboot.project.solarpro.model.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userInfoMapper")
public interface UserInfoMapper {
    UserInfo selectById(Integer id);
    List<UserInfo> selectAll();
}
