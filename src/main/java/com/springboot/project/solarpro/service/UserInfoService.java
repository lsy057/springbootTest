package com.springboot.project.solarpro.service;

import com.github.pagehelper.PageInfo;
import com.springboot.project.solarpro.core.universal.Service;
import com.springboot.project.solarpro.model.UserInfo;

import java.util.List;

public interface UserInfoService extends Service<UserInfo> {
//    UserInfo selectById(String id);
//    PageInfo<UserInfo> selectAll(Integer page, Integer size);
    List<UserInfo> selectAlla(int pageNum, int pageSize);
}
