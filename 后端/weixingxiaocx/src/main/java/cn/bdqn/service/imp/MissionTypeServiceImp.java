package cn.bdqn.service.imp;

import cn.bdqn.mbg.mapper.MissionTypeMapper;
import cn.bdqn.mbg.model.MissionType;
import cn.bdqn.service.MissionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionTypeServiceImp  implements MissionTypeService {

    @Autowired
    private MissionTypeMapper missionTypeMapper;

    @Override
    public List<MissionType> selectTypeName() {
        List<MissionType> missionTypes = missionTypeMapper.selectTypeName();
        return missionTypes;
    }

}
