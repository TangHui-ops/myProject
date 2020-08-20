package cn.bdqn.mbg.mapper;

import cn.bdqn.mbg.model.After;
import cn.bdqn.mbg.model.AfterExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AfterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after
     *
     * @mbggenerated Wed Jun 03 10:06:48 CST 2020
     */
    int countByExample(AfterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after
     *
     * @mbggenerated Wed Jun 03 10:06:48 CST 2020
     */
    int deleteByExample(AfterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after
     *
     * @mbggenerated Wed Jun 03 10:06:48 CST 2020
     */
    int deleteByPrimaryKey(Integer afterId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after
     *
     * @mbggenerated Wed Jun 03 10:06:48 CST 2020
     */
    int insert(After record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after
     *
     * @mbggenerated Wed Jun 03 10:06:48 CST 2020
     */
    int insertSelective(After record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after
     *
     * @mbggenerated Wed Jun 03 10:06:48 CST 2020
     */
    List<After> selectByExample(AfterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after
     *
     * @mbggenerated Wed Jun 03 10:06:48 CST 2020
     */
    After selectByPrimaryKey(Integer afterId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after
     *
     * @mbggenerated Wed Jun 03 10:06:48 CST 2020
     */
    int updateByExampleSelective(@Param("record") After record, @Param("example") AfterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after
     *
     * @mbggenerated Wed Jun 03 10:06:48 CST 2020
     */
    int updateByExample(@Param("record") After record, @Param("example") AfterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after
     *
     * @mbggenerated Wed Jun 03 10:06:48 CST 2020
     */
    int updateByPrimaryKeySelective(After record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after
     *
     * @mbggenerated Wed Jun 03 10:06:48 CST 2020
     */
    int updateByPrimaryKey(After record);
}