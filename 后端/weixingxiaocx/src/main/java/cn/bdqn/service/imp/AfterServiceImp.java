package cn.bdqn.service.imp;


import cn.bdqn.mbg.mapper.AfterMapper;
import cn.bdqn.mbg.model.After;
import cn.bdqn.mbg.model.AfterExample;
import cn.bdqn.service.AfterService;
import cn.bdqn.service.AfterTypeServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 处理表
**/
@Service
    public class AfterServiceImp implements AfterService {
    @Autowired
    private AfterTypeServcie afterTypeService;
    @Autowired
    private  AfterMapper afterMapper;
    @Override
    public boolean inAfter(After after) {
        //获取数据类型id
     Integer id=after.getAfterTypeId();
     //查询是否有这个id
     boolean i= afterTypeService.seAfterTyperbyKey(id);
     //判断
     if(i){
         //添加数据
      int a= afterMapper.insertSelective(after);
         if(a>0)
            return true;
         else
            return false;
                    }
                    return false;
                    }

@Override
public List<After> seAfter() {

    AfterExample afterExample=new AfterExample();
    AfterExample.Criteria criteria=afterExample.createCriteria();
    criteria.andAfterIdIsNotNull();
    afterExample.or(criteria);
    return  afterMapper.selectByExample(afterExample);

        }

@Override
public List<After> seAfterByid(Integer id) {
    AfterExample afterExample=new AfterExample();

    afterExample.or( afterExample.createCriteria().andAfterDpIsNull().andAfterTypeIdEqualTo(id));
    return  afterMapper.selectByExample(afterExample);


}

@Override
public boolean upAfter(After after) {

       int i= afterMapper.updateByPrimaryKeySelective(after);
       if(i>0)
           return true;
       else
           return false;
        }
        }
