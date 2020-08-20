package cn.bdqn.service.imp;

import cn.bdqn.mbg.mapper.AfterTypeMapper;
import cn.bdqn.mbg.model.AfterType;
import cn.bdqn.mbg.model.AfterTypeExample;
import cn.bdqn.service.AfterTypeServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 处理类型表
 */
@Service
public class AfterTypeServcieImp implements AfterTypeServcie {
    /**
     * 查询所有类型
     */
    @Autowired
    private AfterTypeMapper afterTypeMapper;
    @Override
    public List<AfterType> setAfterTyper() {
        AfterTypeExample afterExample=new AfterTypeExample();
        afterExample.createCriteria().andAfterTypeIdIsNotNull();
        return afterTypeMapper.selectByExample(afterExample);
    }

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    @Override
    public boolean seAfterTyperbyKey(Integer id) {
        //从数据库查询数据并返回对象
       AfterType afterType=afterTypeMapper.selectByPrimaryKey(id);
       //判断对象是否为空
      if(afterType == null || "".equals(afterType)){
          return  false;
      }else {
        return true;}
    }
}
