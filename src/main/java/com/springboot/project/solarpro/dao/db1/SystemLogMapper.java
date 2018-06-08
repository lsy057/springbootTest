package com.springboot.project.solarpro.dao.db1;

import com.springboot.project.solarpro.core.universal.Mapper;
import com.springboot.project.solarpro.model.SystemLog;

import java.util.List;

public interface SystemLogMapper extends Mapper<SystemLog> {

    Integer insertByBatch(List<SystemLog> list);
}