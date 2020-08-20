package cn.bdqn.service;

import cn.bdqn.mbg.model.MissionType;

import java.util.List;

public interface MissonTypeService {

    /**
     * 查询所有的任务类别，返回结果为List
     * @return
     */
    List<MissionType> selectTypeAll();

}
