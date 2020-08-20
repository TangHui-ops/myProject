package cn.bdqn.service;

import cn.bdqn.mbg.model.MissionType;

import java.util.List;

public interface MissionTypeService {

    /**
     * 查询任务类别名称，返回结果为List
     * @return
     */
    List<MissionType> selectTypeName();

}
