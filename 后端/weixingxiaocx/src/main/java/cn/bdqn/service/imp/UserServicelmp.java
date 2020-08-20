package cn.bdqn.service.imp;

import cn.bdqn.mbg.mapper.UserMapper;
import cn.bdqn.mbg.model.AfterExample;
import cn.bdqn.mbg.model.User;
import cn.bdqn.mbg.model.UserExample;
import cn.bdqn.service.RedisService;
import cn.bdqn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Random;

@Service
public class UserServicelmp implements UserService {

    @Autowired
    private UserMapper userMapper;



    @Override
    public boolean inUser(User user){

        int i=userMapper.insertSelective(user);
        if(i>0)
            return  true;
        else
        return  false;
    }

    @Override
    public  boolean upUser(Integer id,Integer Typeid){

        User user=new User();
        user.setUserId(id);
        user.setUserType(Typeid);
       int i= userMapper.updateByPrimaryKeySelective(user);
       if(i>0)
           return  true;
       else
           return  false;
    }

    @Override
    public boolean updateUser(User user) {

        int i = userMapper.updateByPrimaryKeySelective(user);
        if(i>0)
            return  true;
        else
            return  false;
    }
    @Override
    public List<User> selecUserby(String name){

        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUserNameEqualTo(name);
        userExample.or(criteria);
        return   userMapper.selectByExample(userExample);
    }

    @Override
    public User selectUser(Integer id){


        return  userMapper.selectByPrimaryKey(id);
    }



    //生成验证码 使用随机数
    @Autowired
    private RedisService redisService;

    //过期时间
    @Value("${redis.aucode.expire}")
    private long AUTHCODE_EXPIRE_TIME;

    @Override
    public String generateAuthCode(String phone) {
        //生成随机数
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();

        for (int i = 0;  i<6 ; i++){
            stringBuffer.append( random.nextInt(10));  //0-10之间的整数
        }
        //存储验证码
        redisService.set(phone , stringBuffer.toString());
        redisService.expire(phone , AUTHCODE_EXPIRE_TIME );

        return stringBuffer.toString();
    }

    //校验验证码
    @Override
    public boolean verifyAuthCode(String phone, String authCode) {
        String   realAuthCode = redisService.get(phone);

        //不为空相等
        if (!StringUtils.isEmpty(realAuthCode)){
            if (realAuthCode.equals(authCode)){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    @Override
    public User SelectUserInfoById(Integer id) {
        //        UserStateExample userStateExample = new UserStateExample();
        //        userStateExample.or(userStateExample.createCriteria().andUserIdIsNotNull().andUserIdEqualTo(id));
        //        return userStateMapper.selectByExample(userStateExample);
        UserExample userExample = new UserExample();
        userExample.or(userExample.createCriteria().andUserIdIsNotNull().andUserIdEqualTo(id));
        List<User> list = userMapper.selectByExample(userExample);
        User user = list.get(0);
        return user;
    }
    @Override
    public User bindalipay(Integer userUsername, String userNum) {
        return userMapper.bindalipay(userUsername , userNum);
    }


}
