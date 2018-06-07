package com.springboot.project.solarpro.service;

import com.springboot.project.solarpro.model.UserRole;
import com.springboot.project.solarpro.core.universal.Service;

import java.util.List;

/**
* @Description: UserRoleService接口
* @author lishuying
* @date 2018/06/07 15:00
*/
public interface UserRoleService extends Service<UserRole> {
    List<String> getRolesByUserId(String userId);
}