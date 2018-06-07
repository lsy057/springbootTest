package com.springboot.project.solarpro.service.impl;

import com.springboot.project.solarpro.dao.db1.SysRoleMapper;
import com.springboot.project.solarpro.model.SysRole;
import com.springboot.project.solarpro.service.SysRoleService;
import com.springboot.project.solarpro.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: SysRoleService接口实现类
* @author lishuying
* @date 2018/06/07 15:00
*/
@Service
public class SysRoleServiceImpl extends AbstractService<SysRole> implements SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

}
