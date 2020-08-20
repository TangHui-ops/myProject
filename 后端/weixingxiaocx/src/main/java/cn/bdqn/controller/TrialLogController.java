package cn.bdqn.controller;


import cn.bdqn.mbg.model.TrialLog;
import cn.bdqn.mbg.model.TrialLogExample;
import cn.bdqn.service.TrialLogServcie;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/trialLog")
public class TrialLogController {

    @Autowired
    private TrialLogServcie trialLogService;

    ////根据任务状态查询 结果返回List
    @GetMapping("/list")
    public Object list(Integer auditId){
        System.out.println(auditId);
        List<TrialLog> trialLogs = trialLogService.selectByExample(auditId);
        return trialLogs;
    }

    //根据id查询 结果返回List
    @GetMapping("/listId")
    public Object listId(Integer trialId){
        TrialLog trialLogs = trialLogService.selectByPrimaryKey(trialId);
        return trialLogs;
    }

    //根据id查询 结果返回List
    @GetMapping("/listId/{trialId}")
    public Object selectByPrimaryKey2(@PathVariable Integer trialId){
        TrialLog trialLogs = trialLogService.selectByPrimaryKey2(trialId);
        System.out.println(trialLogs);
        return trialLogs;
    }

    //添加
    @GetMapping("/insert")
    public int insert(TrialLog trialLog) {
        int i = trialLogService.insert(trialLog);
        if (i>0){
            return 1;
        }else {
            return 0;
        }
    }

    //连表查询
    @GetMapping(value = "/trialLogList")
    public Object getMissionlist(TrialLogExample example){
        Map map = new HashMap();
        List<TrialLog> trialLogs = trialLogService.selectByTrialLog(example);
        map.put("trialLogs",trialLogs);
        return trialLogs;
    }

    //根据trialId删除
    @GetMapping(value = "/deltrialLogById")
    public int deleteByPrimaryKey(Integer trialId){
        return trialLogService.deleteByPrimaryKey(trialId);
    }

    @GetMapping(value = "/selectByTrialId")
    public TrialLog selectByTrialId(Integer trialId){
        System.out.println("查询成功ID--------------");
        TrialLog trialLog = trialLogService.selectByTrialId(trialId);
        System.out.println(trialLog);
        return  trialLog;
    }


   //修改
    @GetMapping("/update")
    public int updateDiary(@Param("trialId") Integer trialId, @Param("auditId") Integer auditId){
        int e=trialLogService.updateDiary(trialId,auditId);
        if (e>0)
            return  1;
        else
            return 0;
    }

    //查询审核中
    @GetMapping(value = "/selectByAuditId")
    public List<TrialLog> selectByAuditId(TrialLog trialLog){
        return trialLogService.selectByAuditId(trialLog);
    }

    //查询未通过
    @GetMapping(value = "/selectByNotAudit")
    public List<TrialLog> selectByNotAudit(TrialLog trialLog) {
        List<TrialLog> trialLogs = trialLogService.selectByNotAudit(trialLog);
        return trialLogs;
    }

    //查询已通过
    @GetMapping(value = "/selectByAuditFinish")
    public List<TrialLog> selectByAuditFinish(TrialLog trialLog) {
        List<TrialLog> trialLogs = trialLogService.selectByAuditFinish(trialLog);
        return trialLogs;
    }

    //查询未提交
    @GetMapping("/selectNotSubmit")
    public List<TrialLog> selectSubmit(TrialLog trialLog) {
        return trialLogService.selectSubmit(trialLog);
    }

    @GetMapping("/audit")
    public Object audit(){
        List<TrialLog> trialLogs = trialLogService.selectByAudit();
        return trialLogs;
    }

}
