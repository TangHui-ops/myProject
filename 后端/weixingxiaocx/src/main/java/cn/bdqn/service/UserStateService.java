package cn.bdqn.service;

import cn.bdqn.mbg.model.User;
import cn.bdqn.mbg.model.UserState;

import java.util.List;

/**
 * 用户状态接口
 */
public interface UserStateService {
    /**
     * 根据用户id封修改用户状态
     * @param user
     * @return
     */
    boolean BanUserById(User user, UserState userState);

    /**
     * 根据用户id查询状态信息
     * @param id
     * @return
     */
    List<UserState> SelectStateInfo(Integer id);
}
