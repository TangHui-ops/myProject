package cn.bdqn.controller;

import cn.bdqn.mbg.model.User;
import cn.bdqn.mbg.model.UserState;
import cn.bdqn.service.UserService;
import cn.bdqn.service.UserStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/*@RestController
public class UserStateController {

    @Autowired
    private UserStateService userStateService;
    @Autowired
    private UserService userService;
    @RequestMapping("/tenlu")
    public User tenlu(String name,Integer username,String pwd){
      List<User> user=userService.selecUserby(name);
      if(user.size()>0){
          return user.get(0);
      }else{
          User user1=new User();
          user1.setUserName(name);
          user1.setUserUsername(username);
          user1.setUserPwd(pwd);
         userService.inUser(user1);
         List<User> user2=userService.selecUserby(name);
      return  user2.get(0);}
    }
//    @RequestMapping("/test")
//    public String log(){
//        User user = new User();
//        user.setUserId(1);
//        user.setUserName("爱对方空间");
//        user.setUserType(1);
//        user.setUserRealName("于博恩");
//        user.setUserIdCard("235407195106112745");
//        user.setUserNum("18842466134");
//        user.setUserCreate(new Date(2020,01,01));
//        user.setUserSf(BigDecimal.valueOf(200));
//        user.setUserBalance(BigDecimal.valueOf(142));
//        user.setUserWd(BigDecimal.valueOf(100));
//        user.setUserEx(43465);
//        user.setUserState(2);
//
//        UserState userState = new UserState();
//        userState.setUserStateId(4);
//        userState.setUserId(1);
//        userState.setUserS(2);
//        userState.setUserStateDate(new Date(2020,05,26));
//        userState.setUserStateDt(new Date(2020,05,27));
//        userState.setUserStateReason("test");
//        userState.setUserStateP(4);
//
//        System.out.println( userStateService.BanUserById(user,userState));
//
//        return user.toString();
////        int a = 1;
////        List<UserState> list = userStateService.SelectStateInfo(a);
////        return list.toString();
//
//    }
    @RequestMapping("/AllStateInfo")
    public List<UserState> SelectAllState(){
        return userStateService.SelectStateInfo();
    }

    @RequestMapping("/StateInfo")
    public List<UserState> SelectStateById(Integer id){
        return userStateService.SelectState(id);
    }

    @RequestMapping("/updateState")
    public boolean updateState(Integer userId,Integer userS,String userStateDt,Integer userStateP,String userStateReason){
        User user = new User();
        user.setUserId(userId);
        user.setUserState(userS);
        UserState userState = new UserState();
        userState.setUserId(userId);
        userState.setUserS(userS);
        Date date=null;
        Date dt=null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String now = simpleDateFormat.format(new Date());// new Date()为获取当前系统时间
        try {
            date = simpleDateFormat.parse(now);
            dt = simpleDateFormat.parse(userStateDt);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        userState.setUserStateDate(date);
        userState.setUserStateDt(dt);
        userState.setUserStateP(userStateP);
        userState.setUserStateReason(userStateReason);
        return userStateService.BanUserById(user,userState);
//        return false;
    }

    @RequestMapping("/getUserInfo")
    public User SelectUserInfo(Integer userId){
        return userService.selectUser(userId);
    }
}*/
