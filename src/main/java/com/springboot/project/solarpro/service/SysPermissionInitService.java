package com.springboot.project.solarpro.service;

import com.springboot.project.solarpro.model.SysPermissionInit;
import com.springboot.project.solarpro.core.universal.Service;

import java.util.List;

/**
* @Description: SysPermissionInitService接口
* @author lishuying
* @date 2018/06/07 19:46
*/
public interface SysPermissionInitService extends Service<SysPermissionInit> {
    List<SysPermissionInit> selectAllOrderBySort();

}