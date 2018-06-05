package com.springboot.project.solarpro.service.impl;

import com.springboot.project.solarpro.core.ret.ServiceException;
import com.springboot.project.solarpro.dao.UserInfoMapper;
import com.springboot.project.solarpro.model.UserInfo;
import com.springboot.project.solarpro.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userInfoServiceImpl")
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    public UserInfo selectById(Integer id){
        UserInfo userInfo=userInfoMapper.selectById(id);
        if(userInfo == null){
            throw new ServiceException("暂无该用户");
        }
        return userInfo;
    }
}
