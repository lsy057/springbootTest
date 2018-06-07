package com.springboot.project.solarpro.service.impl;

import com.springboot.project.solarpro.dao.db1.SysPermissionInitMapper;
import com.springboot.project.solarpro.model.SysPermissionInit;
import com.springboot.project.solarpro.service.SysPermissionInitService;
import com.springboot.project.solarpro.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: SysPermissionInitService接口实现类
* @author lishuying
* @date 2018/06/07 19:46
*/
@Service
public class SysPermissionInitServiceImpl extends AbstractService<SysPermissionInit> implements SysPermissionInitService {

    @Resource
    private SysPermissionInitMapper sysPermissionInitMapper;

    @Override
    public List<SysPermissionInit> selectAllOrderBySort() {
        return sysPermissionInitMapper.selectAllOrderBySort();
    }
}
