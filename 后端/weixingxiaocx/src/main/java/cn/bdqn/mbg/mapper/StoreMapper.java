package cn.bdqn.mbg.mapper;

import cn.bdqn.mbg.model.Store;
import cn.bdqn.mbg.model.StoreExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StoreMapper {

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

    int updateByExampleSelective(StoreExample example);

    int updateByExample(StoreExample example);
}