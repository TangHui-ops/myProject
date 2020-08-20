package cn.bdqn.service.imp;

import cn.bdqn.mbg.mapper.TrialLogMapper;
import cn.bdqn.mbg.model.TrialLog;
import cn.bdqn.mbg.model.TrialLogExample;
import cn.bdqn.service.TrialLogServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrialLogServiceImpl implements TrialLogServcie {

    @Autowired
    private TrialLogMapper trialLogMapper;

    @Override  //根据任务状态查询 结果返回List
    public List<TrialLog> selectByExample(Integer auditId) {
        List<TrialLog> trialLogList = trialLogMapper.selectByExample(auditId);
        return trialLogList;
    }

    @Override    //根据任务id查询
    public TrialLog selectByPrimaryKey(Integer trialId) {
        TrialLog trialLogList =  trialLogMapper.selectByPrimaryKey(trialId);
        return trialLogList;
    }

    @Override
    public int insert(TrialLog trialLog) {
        return trialLogMapper.insert(trialLog);
    }

    @Override
    public List<TrialLog> selectByTrialLog(TrialLogExample example) {
        List<TrialLog> trialLogs = trialLogMapper.selectByTrialLog(example);
        return trialLogs;
    }

    @Override
    public int deleteByPrimaryKey(Integer trialId) {
        int result = trialLogMapper.deleteByPrimaryKey(trialId);
        if(result>0){
            System.out.println("删除成功！！");
        }
        return result;
    }

    @Override
    public TrialLog selectByTrialId(Integer trialId) {
        return trialLogMapper.selectByTrialId(trialId);
    }


    @Override
    public int updateDiary(Integer trialId, Integer auditId) {
        return trialLogMapper.updateDiary(trialId,auditId);
    }

    @Override
    public List<TrialLog> selectByNotAudit(TrialLog trialLog) {
        List<TrialLog> trialLogs = trialLogMapper.selectByNotAudit(trialLog);
        return trialLogs;
    }

    @Override
    public List<TrialLog> selectByAuditFinish(TrialLog trialLog) {
        List<TrialLog> trialLogs = trialLogMapper.selectByAuditFinish(trialLog);
        return trialLogs;
    }

    @Override
    public List<TrialLog> selectByAuditId(TrialLog trialLog){
        List<TrialLog> trialLogs = trialLogMapper.selectByAuditId(trialLog);
        return trialLogs;
    }

    @Override
    public List<TrialLog> selectSubmit(TrialLog trialLog) {
        return trialLogMapper.selectSubmit(trialLog);
    }

    @Override
    public TrialLog selectByPrimaryKey2(Integer trialId) {
        TrialLog trialLog = trialLogMapper.selectByPrimaryKey2(trialId);
        return trialLog;
    }

    @Override
    public List<TrialLog> selectByAudit() {
        List<TrialLog> trialLogList = trialLogMapper.selectByAudit();
        return trialLogList;
    }

}
