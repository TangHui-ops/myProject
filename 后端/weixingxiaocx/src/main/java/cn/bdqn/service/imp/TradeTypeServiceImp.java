package cn.bdqn.service.imp;

import cn.bdqn.mbg.mapper.TradeTypeMapper;
import cn.bdqn.mbg.model.TradeType;
import cn.bdqn.mbg.model.TradeTypeExample;
import cn.bdqn.service.TradeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeTypeServiceImp implements TradeTypeService {
@Autowired
    private TradeTypeMapper tradeTypeMapper;
    @Override
    public int countByExample(TradeTypeExample example) {
        return tradeTypeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TradeTypeExample example) {
        return tradeTypeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer tradeTypeId) {
        return tradeTypeMapper.deleteByPrimaryKey(tradeTypeId);
    }

    @Override
    public int insert(TradeType record) {
        return tradeTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(TradeType record) {
        return tradeTypeMapper.insertSelective(record);
    }

    @Override
    public List<TradeType> selectByExample(TradeTypeExample example) {
        return tradeTypeMapper.selectByExample(example);
    }

    @Override
    public TradeType selectByPrimaryKey(Integer tradeTypeId) {
        return tradeTypeMapper.selectByPrimaryKey(tradeTypeId);
    }

    @Override
    public int updateByExampleSelective(TradeType record, TradeTypeExample example) {
        return tradeTypeMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TradeType record, TradeTypeExample example) {
        return tradeTypeMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TradeType record) {
        return tradeTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TradeType record) {
        return tradeTypeMapper.updateByPrimaryKey(record);
    }
}

