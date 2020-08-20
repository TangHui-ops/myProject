package cn.bdqn.service;


import cn.bdqn.mbg.model.AfterType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AfterTypeServcie {
    /**
     * 查询所有
     * @return
     */
    List<AfterType> setAfterTyper();
    /**
     * 通过id查询数据
     * @param id
     * @return
     */
    boolean seAfterTyperbyKey(@Param("afterTypeid") Integer id);

}
