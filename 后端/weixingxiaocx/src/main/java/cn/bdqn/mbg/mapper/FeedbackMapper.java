package cn.bdqn.mbg.mapper;

import cn.bdqn.mbg.model.Feedback;
import cn.bdqn.mbg.model.FeedbackExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FeedbackMapper {

    int insertSelective(Feedback record);


    List<Feedback> select();


    Feedback selectByPrimaryKey(Integer feedbackId);



    int updateByPrimaryKeySelective(Feedback record);


}