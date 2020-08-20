package cn.bdqn.mbg.mapper;

import cn.bdqn.mbg.model.Mission;
import cn.bdqn.mbg.model.MissionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MissionMapper {

    List<Mission> selectMissionID(Integer missionId);

    List<Mission> selectPublish(Mission mission);

    List<Mission> priority();

    List<Mission> PopData();

    List<Mission> appleData();

    List<Mission> selectByAll();

    List<Mission> selectByNewest();

    List<Mission> selectByTypeId(Integer missionType);

    List<Mission> fuzzyQuery(String missionNo,String missionHeadline,String missionContent);

    int countByExample(MissionExample example);

    int deleteByExample(MissionExample example);

    int deleteByPrimaryKey(Integer missionId);

    int insert(Mission record);

    int insertSelective(Mission record);

    List<Mission> selectByExample(MissionExample example);

    Mission selectByPrimaryKey(Integer missionId);

    int updateByExampleSelective(@Param("record") Mission record, @Param("example") MissionExample example);

    int updateByExample(@Param("record") Mission record, @Param("example") MissionExample example);

    int updateByPrimaryKeySelective(Mission record);

    int updateByPrimaryKey(Mission record);
}