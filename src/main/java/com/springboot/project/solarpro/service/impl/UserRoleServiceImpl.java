package com.springboot.project.solarpro.service.impl;

import com.springboot.project.solarpro.dao.db1.UserRoleMapper;
import com.springboot.project.solarpro.model.UserRole;
import com.springboot.project.solarpro.service.UserRoleService;
import com.springboot.project.solarpro.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: UserRoleService接口实现类
* @author lishuying
* @date 2018/06/07 15:00
*/
@Service
public class UserRoleServiceImpl extends AbstractService<UserRole> implements UserRoleService {

    @Resource
    private UserRoleMapper userRoleMapper;

    public List<String> getRolesByUserId(String userId){
        return userRoleMapper.getRolesByUserId(userId);
    }
}
