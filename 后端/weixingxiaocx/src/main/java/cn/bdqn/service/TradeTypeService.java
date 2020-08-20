package cn.bdqn.service;

import cn.bdqn.mbg.model.TradeType;
import cn.bdqn.mbg.model.TradeTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TradeTypeService {
    int countByExample(TradeTypeExample example);


    int deleteByExample(TradeTypeExample example);


    int deleteByPrimaryKey(Integer tradeTypeId);


    int insert(TradeType record);


    int insertSelective(TradeType record);


    List<TradeType> selectByExample(TradeTypeExample example);


    TradeType selectByPrimaryKey(Integer tradeTypeId);


    int updateByExampleSelective(@Param("record") TradeType record, @Param("example") TradeTypeExample example);


    int updateByExample(@Param("record") TradeType record, @Param("example") TradeTypeExample example);


    int updateByPrimaryKeySelective(TradeType record);


    int updateByPrimaryKey(TradeType record);
}
