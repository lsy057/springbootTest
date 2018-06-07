package com.springboot.project.solarpro.controller;

import com.springboot.project.solarpro.core.ret.RetResult;
import com.springboot.project.solarpro.core.ret.RetResponse;
import com.springboot.project.solarpro.core.utils.ApplicationUtils;
import com.springboot.project.solarpro.model.RolePerm;
import com.springboot.project.solarpro.service.RolePermService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: RolePermController类
* @author lishuying
* @date 2018/06/07 15:00
*/
@RestController
@RequestMapping("/rolePerm")
public class RolePermController {

    @Resource
    private RolePermService rolePermService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(RolePerm rolePerm) throws Exception{
        rolePerm.setId(ApplicationUtils.getUUID());
        Integer state = rolePermService.insert(rolePerm);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = rolePermService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(RolePerm rolePerm) throws Exception {
        Integer state = rolePermService.update(rolePerm);
        return RetResponse.makeOKRsp(state);
    }
    @PostMapping("/selectById")
    public RetResult<RolePerm> selectById(@RequestParam String id) throws Exception {
        RolePerm rolePerm = rolePermService.selectById(id);
        return RetResponse.makeOKRsp(rolePerm);
    }

    /**
    * @Description: 分页查询
    * @param page 页码
    * @param size 每页条数
    * @Reutrn RetResult<PageInfo<RolePerm>>
    */
    @PostMapping("/list")
    public RetResult<PageInfo<RolePerm>> list(@RequestParam(defaultValue = "0") Integer page,
        @RequestParam(defaultValue = "0") Integer size) throws Exception {
        PageHelper.startPage(page, size);
        List<RolePerm> list = rolePermService.selectAll();
        PageInfo<RolePerm> pageInfo = new PageInfo<RolePerm>(list);
        return RetResponse.makeOKRsp(pageInfo);
    }
}
