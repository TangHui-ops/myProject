package cn.bdqn.mbg.mapper;

import cn.bdqn.mbg.model.SendMessage;
import cn.bdqn.mbg.model.SendMessageExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/*
*消息类-
* */
@Mapper
@Repository
public interface SendMessageMapper {


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_message
     * 总数例子
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    int countByExample(SendMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_message
     * 删除例子
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    int deleteByExample(SendMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_message
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    int deleteByPrimaryKey(Integer sendId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_message
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    int insert(SendMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_message
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    int insertSelective(SendMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_message
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    List<SendMessage> selectByExample(SendMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_message
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    SendMessage selectByPrimaryKey(Integer sendId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_message
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    int updateByExampleSelective(@Param("record") SendMessage record, @Param("example") SendMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_message
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    int updateByExample(@Param("record") SendMessage record, @Param("example") SendMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_message
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    int updateByPrimaryKeySelective(SendMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_message
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    int updateByPrimaryKey(SendMessage record);
}