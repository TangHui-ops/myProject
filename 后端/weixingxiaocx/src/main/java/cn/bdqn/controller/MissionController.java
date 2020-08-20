package cn.bdqn.controller;

import cn.bdqn.mbg.model.Mission;
import cn.bdqn.mbg.model.MissionExample;
import cn.bdqn.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Mission")
public class MissionController {

    @Autowired
    private MissionService missionService;

    @PostMapping(value = "/add")
    public Object insert(@RequestBody Mission record){
        int insertMission = missionService.insert(record);
        return insertMission;
    }

    /**
     * 根据类别id查询相应的列表数据
     * @param missionType
     * @return
     */
    @GetMapping("/selByTypeId/{missionType}")
    public List<Mission> selectByExample(@PathVariable Integer missionType){
        System.out.println(missionType);
        List<Mission> missionList = missionService.selectByTypeId(missionType);
        return missionList;
    }


    /**
     * 根据任务标题进行模糊查询
     */
    @GetMapping("/fuzzyQuery")
    public List<Mission> fuzzyQuery(String missionNo,String missionHeadline,String missionContent){
        List<Mission> fuzzy1 = missionService.fuzzyQuery(missionNo,missionHeadline,missionContent);
//        System.out.println(fuzzy1);
        return fuzzy1;
    }


    /**
     * 根据任务的主键查询任务的详情内容
     * @param missionId
     * @return
     */
    @GetMapping("/missionDetail/{missionId}")
    public Mission queryMissionDetail(@PathVariable Integer missionId){
        Mission detailList = missionService.queryMissionDetail(missionId);
        return detailList;
    }

    /**
     * 根据最新时间查询数据
     * @return
     */
    @GetMapping("/selectByNewest")
    public List<Mission> selectByNewest(){
        List<Mission> newList = missionService.selectByNewest();
        return newList;
    }

    /**
     * 查询全部的任务数据
     * @return
     */
    @GetMapping("/selectByAll")
    public List<Mission> selectByAll() {
        List<Mission> allList = missionService.selectByAll();
        return allList;
    }

    /**
     * 查询设备为苹果的数据
     * @return
     */
    @GetMapping("/appleData")
    public List<Mission> appleData() {
        List<Mission> appleList = missionService.appleData();
        return appleList;
    }

    /**
     * 查询人气的数据
     * @return
     */
    @GetMapping("/PopData")
    public List<Mission> PopData() {
        List<Mission> popleList = missionService.PopData();
        return popleList;
    }

    /**
     * 查询优先
     * @return
     */
    @GetMapping("/priority")
    public List<Mission> priority() {
        List<Mission> priorityleList = missionService.priority();
        return  priorityleList;
    }

    /**
     * 查询发布任务
     */
    @GetMapping(value = "/selectPublish")
    public List<Mission> selectPublish(Mission mission) {
        Map map = new HashMap<>();
        List<Mission> publishList = missionService.selectPublish(mission);
        map.put("publishList",publishList);
        return publishList;
    }

    /**
     * 根据用户id查询，发布任务
     */
    @GetMapping(value = "/selectMissionID")
    public List<Mission> selectMissionID(Integer missionId) {
        List<Mission> missionList = missionService.selectMissionID(missionId);
        return missionList;
    }

    /**
     * 根据missionid删除
     */
    @GetMapping(value = "/delMissionById")
    public int deleteByPrimaryKey(Integer missionId) {
        return missionService.deleteByPrimaryKey(missionId);
    }
}
