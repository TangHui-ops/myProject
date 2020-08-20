package cn.bdqn.service;

import cn.bdqn.mbg.model.AuditType;
import cn.bdqn.mbg.model.AuditTypeExample;

import java.util.List;

public interface AuditTypeService {

    List<AuditType> selectByExample(AuditTypeExample example);

}
