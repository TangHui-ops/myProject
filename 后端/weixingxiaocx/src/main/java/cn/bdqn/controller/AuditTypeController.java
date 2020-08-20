package cn.bdqn.controller;

import cn.bdqn.mbg.model.AuditType;
import cn.bdqn.mbg.model.AuditTypeExample;
import cn.bdqn.service.AuditTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/auditType")
public class AuditTypeController {

    @Autowired
    private AuditTypeService auditTypeService;

    @GetMapping(value = "/auditTypeList")
    public List<AuditType> selectByExample(AuditTypeExample example){
        return auditTypeService.selectByExample(example);
    }

}
