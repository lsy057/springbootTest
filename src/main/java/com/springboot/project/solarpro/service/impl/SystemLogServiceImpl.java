package com.springboot.project.solarpro.service.impl;

import com.springboot.project.solarpro.dao.db1.SystemLogMapper;
import com.springboot.project.solarpro.model.SystemLog;
import com.springboot.project.solarpro.service.SystemLogService;
import com.springboot.project.solarpro.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: SystemLogService接口实现类
* @author 张瑶
* @date 2018/06/07 08:42
*/
@Service
public class SystemLogServiceImpl extends AbstractService<SystemLog> implements SystemLogService {

    @Resource
    private SystemLogMapper systemLogMapper;

    @Override
    public Integer insertByBatch(List<SystemLog> list) {
        return systemLogMapper.insertByBatch(list);
    }
}
