package cn.bdqn.service;

import cn.bdqn.mbg.model.TrialLog;
import cn.bdqn.mbg.model.TrialLogExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface TrialLogServcie {

    /**
     * 根据任务状态查询 结果返回List
     * @param auditId
     * @return
     */
    public List<TrialLog> selectByExample(Integer auditId);

    /**
     * 根据任务id查询
     */
    TrialLog selectByPrimaryKey(Integer trialId);

    /**
     * 上传验证
     */
    int insert(TrialLog trialLog);

    /**
     * 连表查询信息
     * @param example
     * @return
     */
    List<TrialLog> selectByTrialLog(TrialLogExample example);

    /**
     * 根据id删除
     */
    int deleteByPrimaryKey(Integer trialId);

    /**
     * 连表查询，任务详情页
     */
    TrialLog selectByTrialId(Integer trialId);

   /**
     * 修改任务状态
     */
    int updateDiary(@Param("trialId") Integer trialId, @Param("auditId") Integer auditId);

    /**
     * 查询审核中
     */
    List<TrialLog> selectByNotAudit(TrialLog trialLog);

    /**
     * 查询已通过
     */
    List<TrialLog> selectByAuditFinish(TrialLog trialLog);

    /**
     * 查询未通过
     */
    List<TrialLog> selectByAuditId(TrialLog trialLog);

    List<TrialLog> selectSubmit(TrialLog trialLog);

    /**
     * 上传验证查询
     * @param trialId
     * @return
     */
    TrialLog selectByPrimaryKey2(Integer trialId);

    /**
     * 查询已审核
     * @param auditId
     * @return
     */
    List<TrialLog> selectByAudit();

}
