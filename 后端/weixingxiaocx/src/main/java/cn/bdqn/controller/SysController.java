package cn.bdqn.controller;

import cn.bdqn.mbg.model.Sys;
import cn.bdqn.mbg.model.SysExample;
import cn.bdqn.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Sys")
public class SysController {

    @Autowired
    private SysService sysService;

    @GetMapping(value = "/select")
    public Object getSys(SysExample example){
        Map map = new HashMap();
        List<Sys> SysList = sysService.getByExample(example);
        map.put("SysList",SysList);
        return SysList;
    }

}
