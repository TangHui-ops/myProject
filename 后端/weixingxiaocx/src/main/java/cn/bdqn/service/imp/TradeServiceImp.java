package cn.bdqn.service.imp;


import cn.bdqn.mbg.mapper.TradeMapper;
import cn.bdqn.mbg.model.Trade;
import cn.bdqn.mbg.model.TradeExample;
import cn.bdqn.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TradeServiceImp implements TradeService {
@Autowired
private TradeMapper tradeMapper;



    @Override
    public boolean insertSelective(Trade record) {
//判断有没有这个用户

        int i= tradeMapper.insertSelective(record);
        if(i>0)
            return  true;
        else
            return false;

    }

    @Override
    public List<Trade> selectByExample(TradeExample example) {
        return tradeMapper.selectByExample(example);
    }

    @Override
    public Trade selectByPrimaryKey(Integer tradeId) {
        return tradeMapper.selectByPrimaryKey(tradeId);
    }

    @Override
    public int updateByExampleSelective(Trade record, TradeExample example) {
        return tradeMapper.updateByExampleSelective(record,example);
    }


    @Override
    public int updateByPrimaryKeySelective(Trade record) { return tradeMapper.updateByPrimaryKeySelective(record);
    }

}
