package com.springboot.project.solarpro.service.impl;

import com.springboot.project.solarpro.dao.db1.RolePermMapper;
import com.springboot.project.solarpro.model.RolePerm;
import com.springboot.project.solarpro.service.RolePermService;
import com.springboot.project.solarpro.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: RolePermService接口实现类
* @author lishuying
* @date 2018/06/07 15:00
*/
@Service
public class RolePermServiceImpl extends AbstractService<RolePerm> implements RolePermService {

    @Resource
    private RolePermMapper rolePermMapper;

    public List<String> getPermsByUserId(String userId){
        return rolePermMapper.getPermsByUserId(userId);
    }

}
