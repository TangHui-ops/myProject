package cn.bdqn.service.imp;

import cn.bdqn.mbg.mapper.StoreMapper;
import cn.bdqn.mbg.model.Store;
import cn.bdqn.mbg.model.StoreExample;
import cn.bdqn.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceimp implements StoreService {
    @Autowired
    private StoreMapper storeMapper;


    @Override
    public int countByExample(StoreExample example) {
        return storeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StoreExample example) {
        return storeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer storeId) {
        return storeMapper.deleteByPrimaryKey(storeId);
    }

    @Override
    public int insert(Store record) {
        return storeMapper.insert(record);
    }

    @Override
    public int insertSelective(Store record) {
        return storeMapper.insertSelective(record);
    }

    @Override
    public List<Store> selectByExample(StoreExample example) {
        return storeMapper.selectByExample(example);
    }

    @Override
    public Store selectByPrimaryKey(Integer storeId) {
        return storeMapper.selectByPrimaryKey(storeId);
    }

    @Override
    public int updateByExampleSelective(Store record, StoreExample example) {
        return storeMapper.updateByExampleSelective(example);
    }

    @Override
    public int updateByExample(Store record, StoreExample example) {
        return storeMapper.updateByExample(example);
    }

    @Override
    public int updateByPrimaryKeySelective(Store record) {
        return storeMapper.updateByPrimaryKeySelective(record);

    }

    @Override
    public int updateByPrimaryKey(Store record) {
        return storeMapper.updateByPrimaryKey(record);
    }
}



