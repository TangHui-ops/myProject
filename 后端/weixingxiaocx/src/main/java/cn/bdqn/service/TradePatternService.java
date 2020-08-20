package cn.bdqn.service;

import cn.bdqn.mbg.model.TradePattern;
import cn.bdqn.mbg.model.TradePatternExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TradePatternService {
    int countByExample(TradePatternExample example);


    int deleteByExample(TradePatternExample example);


    int deleteByPrimaryKey(Integer tradePatternId);


    int insert(TradePattern record);

    int insertSelective(TradePattern record);


    List<TradePattern> selectByExample(TradePatternExample example);


    TradePattern selectByPrimaryKey(Integer tradePatternId);


    int updateByExampleSelective(@Param("record") TradePattern record, @Param("example") TradePatternExample example);


    int updateByExample(@Param("record") TradePattern record, @Param("example") TradePatternExample example);


    int updateByPrimaryKeySelective(TradePattern record);


    int updateByPrimaryKey(TradePattern record);
}
