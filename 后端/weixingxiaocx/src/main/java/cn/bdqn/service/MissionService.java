package cn.bdqn.service;

import cn.bdqn.mbg.model.Mission;
import cn.bdqn.mbg.model.MissionExample;

import java.util.List;

public interface  MissionService {

    /**
     * 添加任务，返回结果为Int
     * @return
     */
    int insert(Mission record);

    /**
     * 根据任务类别查询该分类下的任务列表
     * @param missionType
     * @return
     */
    List<Mission> selectByTypeId(Integer missionType);


    /**
     * 根据任务标题进行模糊查询
     */
    List<Mission> fuzzyQuery(String missionNo,String missionHeadline,String missionContent);


    /**
     * 根据任务的主键查询任务的详情内容
     * @param missionId
     * @return
     */
    Mission queryMissionDetail(Integer missionId);


    /**
     * 根据最新时间查询数据
     * @return
     */
    List<Mission> selectByNewest();

    /**
     * 查询全部的任务数据
     * @return
     */
    List<Mission> selectByAll();

    /**
     * 查询设备为苹果的任务数据
     * @return
     */
    List<Mission> appleData();


    /**
     * 查询人气的数据
     * @return
     */
    List<Mission> PopData();

    /**
     * 查询优先
     * @return
     */
    List<Mission> priority();

    /**
     * 查询发布任务
     */
    List<Mission> selectPublish(Mission mission);

    /**
     * 根据用户id查询，发布任务
     */
    List<Mission> selectMissionID(Integer missionId);

    /**
     * 根据missionId删除
     */
    int deleteByPrimaryKey(Integer missionId);

}
