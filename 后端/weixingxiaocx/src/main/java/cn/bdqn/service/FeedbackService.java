package cn.bdqn.service;

import cn.bdqn.mbg.model.Feedback;

import java.util.List;

public interface FeedbackService {
    /**
     * 查询反馈表
     * @return
     */
    List<Feedback> setFeedback();

    /**
     * 返回处理结果
     * @param feedback
     * @return
     */
    boolean upFeedback(Feedback feedback);

    Feedback selectByPrimaryKey(Integer feedbackId);

    int insertSelective(Feedback record);
}
