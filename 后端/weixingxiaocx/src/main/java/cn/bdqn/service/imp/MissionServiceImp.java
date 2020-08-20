package cn.bdqn.service.imp;

import cn.bdqn.mbg.mapper.MissionMapper;
import cn.bdqn.mbg.model.Mission;
import cn.bdqn.mbg.model.MissionExample;
import cn.bdqn.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionServiceImp implements MissionService {

    @Autowired
    private MissionMapper missionMapper;

    @Override
    public int insert(Mission record) {
        int result = missionMapper.insert(record);
        if(result>0){
            System.out.println("添加成功");
        }
        return result;
    }

    @Override
    public List<Mission> selectByTypeId(Integer missionType) {

        List<Mission> missionList = missionMapper.selectByTypeId(missionType);

        return missionList;
    }

    @Override
    public List<Mission> fuzzyQuery(String missionNo,String missionHeadline,String missionContent) {
        /*Mission mission = new Mission();
        mission.setMissionNo(Integer.parseInt(missionNo));
        mission.setMissionHeadline(missionContent);
        mission.setMissionContent(missionContent);*/

        List<Mission> fuzzy1 = missionMapper.fuzzyQuery(missionNo,missionHeadline,missionContent);
        System.out.println(fuzzy1);
        return fuzzy1;
    }


    @Override
    public Mission queryMissionDetail(Integer missionId) {
        return missionMapper.selectByPrimaryKey(missionId);
    }

    @Override
    public List<Mission> selectByNewest() {
        List<Mission> newList = missionMapper.selectByNewest();

        return newList;
    }

    @Override
    public List<Mission> selectByAll() {
        List<Mission> allList = missionMapper.selectByAll();
        return allList;
    }

    @Override
    public List<Mission> appleData() {
        List<Mission> appleList = missionMapper.appleData();
        return appleList;
    }

    @Override
    public List<Mission> PopData() {
        List<Mission> popleList = missionMapper.PopData();
        return popleList;
    }

    @Override
    public List<Mission> priority() {
        List<Mission> priorityleList = missionMapper.priority();
        return  priorityleList;
    }

    @Override
    public List<Mission> selectPublish(Mission mission) {
        List<Mission> publishList = missionMapper.selectPublish(mission);
        return publishList;
    }

    @Override
    public List<Mission> selectMissionID(Integer missionId) {
        List<Mission> missionList = missionMapper.selectMissionID(missionId);
        return missionList;
    }

    @Override
    public int deleteByPrimaryKey(Integer missionId) {
        int result = missionMapper.deleteByPrimaryKey(missionId);
        if(result>0){
            return 1;
        }
        return 0;
    }
}
