package cn.bdqn.service.imp;

import cn.bdqn.mbg.mapper.UserStateMapper;
import cn.bdqn.mbg.model.User;
import cn.bdqn.mbg.model.UserState;
import cn.bdqn.mbg.model.UserStateExample;
import cn.bdqn.service.UserService;
import cn.bdqn.service.UserStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户状态接口实现类
 */
/*@Service
public class UserStateServiceImp implements UserStateService {

    @Autowired
    private UserService userService;
    @Autowired
    private UserStateMapper userStateMapper;
    @Override
    public boolean BanUserById(User user, UserState userState) {
        boolean a = userService.updateUser(user);
        int b = userStateMapper.insertSelective(userState);
        if(a==true && b==1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<UserState> SelectState(Integer id) {
        UserStateExample userStateExample = new UserStateExample();
        userStateExample.or(userStateExample.createCriteria().andUserIdIsNotNull().andUserIdEqualTo(id));
        return userStateMapper.selectByExample(userStateExample);

    }

    @Override
    public List<UserState> SelectStateInfo() {
        UserStateExample userStateExample = new UserStateExample();
        UserStateExample.Criteria criteria = userStateExample.createCriteria();
        criteria.andUserIdIsNotNull();
        userStateExample.or(criteria);
        return userStateMapper.selectByExample(userStateExample);
    }
}*/
