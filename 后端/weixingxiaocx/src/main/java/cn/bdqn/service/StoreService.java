package cn.bdqn.service;

import cn.bdqn.mbg.model.Store;
import cn.bdqn.mbg.model.StoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StoreService {

    int countByExample(StoreExample example);


    int deleteByExample(StoreExample example);


    int deleteByPrimaryKey(Integer storeId);


    int insert(Store record);

    int insertSelective(Store record);


    List<Store> selectByExample(StoreExample example);


    Store selectByPrimaryKey(Integer storeId);


    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);


    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}
