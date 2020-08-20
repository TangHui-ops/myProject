package cn.bdqn.service.imp;

import cn.bdqn.mbg.mapper.TradePatternMapper;
import cn.bdqn.mbg.model.TradePattern;
import cn.bdqn.mbg.model.TradePatternExample;
import cn.bdqn.service.TradePatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TradePatternServiceImp implements TradePatternService {
    @Autowired
    private TradePatternMapper tradePatternMapper;
    @Override
    public int countByExample(TradePatternExample example) {
        return tradePatternMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TradePatternExample example) {
        return tradePatternMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer tradePatternId) {
        return tradePatternMapper.deleteByPrimaryKey(tradePatternId);
    }

    @Override
    public int insert(TradePattern record) {
        return tradePatternMapper.insert(record);
    }

    @Override
    public int insertSelective(TradePattern record) {
        return tradePatternMapper.insertSelective(record);
    }

    @Override
    public List<TradePattern> selectByExample(TradePatternExample example) {
        return tradePatternMapper.selectByExample(example);
    }

    @Override
    public TradePattern selectByPrimaryKey(Integer tradePatternId) {
        return tradePatternMapper.selectByPrimaryKey(tradePatternId);
    }

    @Override
    public int updateByExampleSelective(TradePattern record, TradePatternExample example) {
        return tradePatternMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TradePattern record, TradePatternExample example) {
        return tradePatternMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TradePattern record) {
        return tradePatternMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TradePattern record) {
        return tradePatternMapper.updateByPrimaryKey(record);
    }
}
