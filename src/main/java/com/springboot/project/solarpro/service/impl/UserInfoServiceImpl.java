package com.springboot.project.solarpro.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.project.solarpro.core.ret.ServiceException;
import com.springboot.project.solarpro.core.universal.AbstractService;
import com.springboot.project.solarpro.dao.UserInfoMapper;
import com.springboot.project.solarpro.model.UserInfo;
import com.springboot.project.solarpro.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl extends AbstractService<UserInfo> implements UserInfoService{

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectById(String id){
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        if(userInfo == null){
            throw new ServiceException("暂无该用户");
        }
        return userInfo;
    }

    /*@Override
    public PageInfo<UserInfo> selectAll(Integer page, Integer size) {
        //开启分页查询，写在查询语句上方
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（Select）方法会被分页。
        PageHelper.startPage(page, size);
        List<UserInfo> userInfoList = userInfoMapper.selectAll();
        PageInfo<UserInfo> pageInfo = new PageInfo<>(userInfoList);
        return pageInfo;
    }*/

}
