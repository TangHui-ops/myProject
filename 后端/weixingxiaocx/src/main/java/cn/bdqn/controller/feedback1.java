package cn.bdqn.controller;

import cn.bdqn.mbg.model.Feedback;
import cn.bdqn.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController

public class feedback1 {
 @Autowired
    private FeedbackService feedbackService;
    @PostMapping("/feedback")
    public Boolean insertService(Feedback record) {
        int i = feedbackService.insertSelective(record);
        if (i > 0)
            return true;
        else
            return false;
    }

    @GetMapping("/feedback1")
    public Feedback getFeedbackId(Integer feedbackId) {
              System.out.println("================"+feedbackId);

        return feedbackService.selectByPrimaryKey(feedbackId);
    }

}

