package cn.bdqn.service.imp;

import cn.bdqn.mbg.mapper.SysMapper;
import cn.bdqn.mbg.model.Sys;
import cn.bdqn.mbg.model.SysExample;
import cn.bdqn.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysServiceImp implements SysService {

    @Autowired
    private SysMapper sysMapper;

    @Override
    public List<Sys> getByExample(SysExample example) {
        return sysMapper.selectByExample(example);
    }
}
