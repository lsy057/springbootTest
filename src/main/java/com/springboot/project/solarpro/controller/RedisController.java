package com.springboot.project.solarpro.controller;


import com.springboot.project.solarpro.core.ret.RetResponse;
import com.springboot.project.solarpro.core.ret.RetResult;
import com.springboot.project.solarpro.service.RedisService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 张瑶
 * @Description:
 * @date 2018/4/30 11:28
 */
@RestController
@RequestMapping("redis")
public class RedisController {

    @Resource
    private RedisService redisService;

    @PostMapping("/setRedis")
    public RetResult<String> setRedis(String name) {
        redisService.set("name",name);
        return RetResponse.makeOKRsp(name);
    }

    @PostMapping("/getRedis")
    public RetResult<String> getRedis() {
        String name = redisService.get("name");
        return RetResponse.makeOKRsp(name);
    }


}