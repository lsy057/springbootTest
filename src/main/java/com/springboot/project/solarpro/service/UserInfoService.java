package com.springboot.project.solarpro.service;

import com.github.pagehelper.PageInfo;
import com.springboot.project.solarpro.model.UserInfo;

public interface UserInfoService {

    UserInfo selectById(Integer id);
    PageInfo<UserInfo> selectAll(Integer page, Integer size);

}
