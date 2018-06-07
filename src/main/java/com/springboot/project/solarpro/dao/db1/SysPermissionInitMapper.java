package com.springboot.project.solarpro.dao.db1;

import com.springboot.project.solarpro.core.universal.Mapper;
import com.springboot.project.solarpro.model.SysPermissionInit;

import java.util.List;

public interface SysPermissionInitMapper extends Mapper<SysPermissionInit> {
    List<SysPermissionInit> selectAllOrderBySort();
}