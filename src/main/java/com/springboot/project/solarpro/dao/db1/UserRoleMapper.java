package com.springboot.project.solarpro.dao.db1;

import com.springboot.project.solarpro.core.universal.Mapper;
import com.springboot.project.solarpro.model.UserRole;

import java.util.List;

public interface UserRoleMapper extends Mapper<UserRole> {
    List<String> getRolesByUserId(String userId);
}