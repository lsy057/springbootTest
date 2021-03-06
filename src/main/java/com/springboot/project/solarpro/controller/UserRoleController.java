package com.springboot.project.solarpro.controller;

import com.springboot.project.solarpro.core.ret.RetResult;
import com.springboot.project.solarpro.core.ret.RetResponse;
import com.springboot.project.solarpro.core.utils.ApplicationUtils;
import com.springboot.project.solarpro.model.UserRole;
import com.springboot.project.solarpro.service.UserRoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: UserRoleController类
* @author lishuying
* @date 2018/06/07 15:00
*/
@RestController
@RequestMapping("/userRole")
public class UserRoleController {

    @Resource
    private UserRoleService userRoleService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(UserRole userRole) throws Exception{
        userRole.setId(ApplicationUtils.getUUID());
        Integer state = userRoleService.insert(userRole);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = userRoleService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(UserRole userRole) throws Exception {
        Integer state = userRoleService.update(userRole);
        return RetResponse.makeOKRsp(state);
    }
    @PostMapping("/selectById")
    public RetResult<UserRole> selectById(@RequestParam String id) throws Exception {
        UserRole userRole = userRoleService.selectById(id);
        return RetResponse.makeOKRsp(userRole);
    }

    /**
    * @Description: 分页查询
    * @param page 页码
    * @param size 每页条数
    * @Reutrn RetResult<PageInfo<UserRole>>
    */
    @PostMapping("/list")
    public RetResult<PageInfo<UserRole>> list(@RequestParam(defaultValue = "0") Integer page,
        @RequestParam(defaultValue = "0") Integer size) throws Exception {
        PageHelper.startPage(page, size);
        List<UserRole> list = userRoleService.selectAll();
        PageInfo<UserRole> pageInfo = new PageInfo<UserRole>(list);
        return RetResponse.makeOKRsp(pageInfo);
    }
}
