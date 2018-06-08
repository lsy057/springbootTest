package com.springboot.project.solarpro.service;

import com.springboot.project.solarpro.model.SystemLog;
import com.springboot.project.solarpro.core.universal.Service;

import java.util.List;

/**
* @Description: SystemLogService接口
* @author 张瑶
* @date 2018/06/07 08:42
*/
public interface SystemLogService extends Service<SystemLog> {
    Integer insertByBatch(List<SystemLog> list);
}