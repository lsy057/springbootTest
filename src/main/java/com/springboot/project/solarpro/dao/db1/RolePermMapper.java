package com.springboot.project.solarpro.dao.db1;

import com.springboot.project.solarpro.core.universal.Mapper;
import com.springboot.project.solarpro.model.RolePerm;

import java.util.List;

public interface RolePermMapper extends Mapper<RolePerm> {
    List<String> getPermsByUserId(String userId);
}