package cn.bdqn.controller;

import cn.bdqn.mbg.model.MissionType;
import cn.bdqn.service.MissionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/MissionType")
public class MissionTypeController {

    @Autowired
    private MissionTypeService missionTypeService;

    /**
     * 查询类别
     * @return
     */
    @GetMapping("/selectTypeName")
    public List<MissionType> selectTypeAll() {
        List<MissionType> missionTypes = missionTypeService.selectTypeName();
        return missionTypes;
    }


}
