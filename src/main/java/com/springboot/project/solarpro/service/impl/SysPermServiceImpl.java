package com.springboot.project.solarpro.service.impl;

import com.springboot.project.solarpro.dao.db1.SysPermMapper;
import com.springboot.project.solarpro.model.SysPerm;
import com.springboot.project.solarpro.service.SysPermService;
import com.springboot.project.solarpro.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: SysPermService接口实现类
* @author lishuying
* @date 2018/06/07 15:00
*/
@Service
public class SysPermServiceImpl extends AbstractService<SysPerm> implements SysPermService {

    @Resource
    private SysPermMapper sysPermMapper;

}
