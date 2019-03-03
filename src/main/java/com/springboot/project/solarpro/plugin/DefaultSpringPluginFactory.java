package com.springboot.project.solarpro.plugin;

import com.springboot.project.solarpro.plugin.bean.PluginConfig;
import com.springboot.project.solarpro.plugin.bean.Plugins;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class DefaultSpringPluginFactory {

    public void activePlugin(String id){


    }
    public List<PluginConfig> flushConfigs(){
        return  null;

    }

}
