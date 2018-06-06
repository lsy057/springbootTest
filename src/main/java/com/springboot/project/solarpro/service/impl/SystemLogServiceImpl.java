package com.springboot.project.solarpro.service.impl;

import com.springboot.project.solarpro.dao.SystemLogMapper;
import com.springboot.project.solarpro.model.SystemLog;
import com.springboot.project.solarpro.service.SystemLogService;
import com.springboot.project.solarpro.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: SystemLogService接口实现类
* @author 张瑶
* @date 2018/06/06 18:52
*/
@Service
public class SystemLogServiceImpl extends AbstractService<SystemLog> implements SystemLogService {

    @Resource
    private SystemLogMapper systemLogMapper;

}
