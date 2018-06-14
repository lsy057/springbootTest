package com.springboot.project.solarpro.dao.db1;

import com.springboot.project.solarpro.core.universal.Mapper;
import com.springboot.project.solarpro.model.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper extends Mapper<UserInfo> {

//    UserInfo selectById(Integer id);
//    List<UserInfo> selectAll();
    List<UserInfo> selectAll(@Param("pageNumKey") int pageNum,
                         @Param("pageSizeKey") int pageSize);
}
