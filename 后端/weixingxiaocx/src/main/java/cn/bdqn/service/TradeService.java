package cn.bdqn.service;

import cn.bdqn.mbg.model.Trade;
import cn.bdqn.mbg.model.TradeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TradeService {

    boolean insertSelective(Trade record);


    List<Trade> selectByExample(TradeExample example);


    Trade selectByPrimaryKey(Integer tradeId);


    int updateByExampleSelective(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByPrimaryKeySelective(Trade record);



}
