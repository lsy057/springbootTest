package com.springboot.project.solarpro.plugin.controller;

import com.springboot.project.solarpro.plugin.DefaultSpringPluginFactory;
import com.springboot.project.solarpro.plugin.bean.PluginConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;

@Controller
@RequestMapping(value = "/plugin")
public class PluginController {
    @Autowired
    private DefaultSpringPluginFactory pluginFactory;

    @RequestMapping(value = "/list", method = {RequestMethod.GET,RequestMethod.POST})
    public String getHavePlugins(HttpServletRequest req, HttpServletResponse resp){
        Collection<PluginConfig> pluginConfigs = null;
        pluginConfigs= pluginFactory.flushConfigs();
        req.setAttribute("havaPlugin",pluginConfigs);
        return "/plugins";
    }
    @RequestMapping(value = "/active", method = {RequestMethod.GET,RequestMethod.POST})
    private void activePlugin(HttpServletRequest req, HttpServletResponse resp){
        pluginFactory.activePlugin(req.getParameter("id"));
        try{
            resp.getWriter().append("active succesed!");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
