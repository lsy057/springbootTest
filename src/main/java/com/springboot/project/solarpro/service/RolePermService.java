package com.springboot.project.solarpro.service;

import com.springboot.project.solarpro.model.RolePerm;
import com.springboot.project.solarpro.core.universal.Service;

import java.util.List;

/**
* @Description: RolePermService接口
* @author lishuying
* @date 2018/06/07 15:00
*/
public interface RolePermService extends Service<RolePerm> {
    List<String> getPermsByUserId(String userId);
}