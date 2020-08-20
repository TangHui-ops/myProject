package cn.bdqn.service;

import cn.bdqn.mbg.model.After;

import java.util.List;

public interface AfterService {
    /**
     * 添加数据
     * @param after
     * @return
     */
    boolean inAfter(After after);

    /**
     * 查找所有数据
     * @return
     */
    List<After> seAfter();

    /**
     * 根据处理类型id查找数据
     * @param id
     * @return
     */
    List<After> seAfterByid(Integer id);

    /**
     * 返回处理结果
     * @param after
     * @return
     */
    boolean upAfter(After after);


}
