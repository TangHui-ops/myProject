package cn.bdqn.service;

import cn.bdqn.mbg.model.User;
import org.springframework.stereotype.Service;
import java.util.List;


public interface UserService {


    boolean inUser(User user);
    /**
     * 修改角色属性
     * @param id
     * @param Typeid
     * @return
     */

    boolean upUser(Integer id ,Integer Typeid);

    boolean updateUser(User user);
//查询是否有这个用户
    List<User> selecUserby(String name);
    /**
     * 根据id查询
     * @param id
     * @return
     */
   User selectUser(Integer id);


    /**
     * 生成验证码
     * phone : 手机号
     */
    public String generateAuthCode(String phone);

    /**
     * 校验
     * authCode : 验证码
     *
     */
    public boolean verifyAuthCode(String  phone , String authCode);


    /**
     * 根据ID查询用户信息
     * from hjq
     * @param id
     * @return
     */
    public User SelectUserInfoById(Integer id);



    User bindalipay (Integer userUsername , String userNum );
}
