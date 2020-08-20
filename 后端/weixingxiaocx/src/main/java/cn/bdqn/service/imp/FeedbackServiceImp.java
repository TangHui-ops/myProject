package cn.bdqn.service.imp;

import cn.bdqn.mbg.mapper.FeedbackMapper;
import cn.bdqn.mbg.model.Feedback;
import cn.bdqn.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImp implements FeedbackService {
    @Autowired
    private FeedbackMapper feedbackMapper;
    @Override
    public List<Feedback> setFeedback(){
        return  feedbackMapper.select();
    }
    @Override
    public  boolean upFeedback(Feedback feedback){
      int i=  feedbackMapper.updateByPrimaryKeySelective(feedback);
      if(i>0)
          return true;
      else
        return false;
    }

    @Override
    public Feedback selectByPrimaryKey(Integer feedbackId) {
        return null;
    }

    @Override
    public int insertSelective(Feedback record) {
        return 0;
    }
}
