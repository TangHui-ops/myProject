package cn.bdqn.service.imp;

import cn.bdqn.mbg.mapper.AuditTypeMapper;
import cn.bdqn.mbg.model.AuditType;
import cn.bdqn.mbg.model.AuditTypeExample;
import cn.bdqn.service.AuditTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AuditTypeServiceImp  implements AuditTypeService {

    @Autowired
    private AuditTypeMapper auditTypeMapper;

    @Override
    public List<AuditType> selectByExample(AuditTypeExample example) {
        List<AuditType> auditTypeList = auditTypeMapper.selectByExample(example);
        Map map = new HashMap();
        map.put("auditTypeList",auditTypeList);
        return auditTypeList;
    }
}
