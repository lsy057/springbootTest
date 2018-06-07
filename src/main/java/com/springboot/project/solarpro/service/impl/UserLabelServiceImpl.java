package com.springboot.project.solarpro.service.impl;

import com.springboot.project.solarpro.dao.db2.UserLabelMapper;
import com.springboot.project.solarpro.model.UserLabel;
import com.springboot.project.solarpro.service.UserLabelService;
import com.springboot.project.solarpro.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: UserLabelService接口实现类
* @author lishuying
* @date 2018/06/07 08:53
*/
@Service
public class UserLabelServiceImpl extends AbstractService<UserLabel> implements UserLabelService {

    @Resource
    private UserLabelMapper userLabelMapper;

}
