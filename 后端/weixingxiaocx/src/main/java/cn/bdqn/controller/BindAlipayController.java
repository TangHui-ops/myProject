package cn.bdqn.controller;

import cn.bdqn.mbg.model.Sys;
import cn.bdqn.service.SmsSerevice;
import cn.bdqn.service.UserService;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class BindAlipayController {


    @Autowired
    private SmsSerevice smsSerevice;

    @Autowired
    private UserService userService;

    @Value("${redis.aucode.expire}")
    private long AUTHCODE_EXPIRE_TIME;



    //进入初始页面
    @RequestMapping("/qwq")
    public String aaa(){
        return "index";
    }

    //发送短信
    @RequestMapping("/sendsms")
    public String send(@RequestParam String telphone){
        String authoCoe =  userService.generateAuthCode(telphone);
        smsSerevice.send( telphone , "1" , new String[]{authoCoe , String.valueOf(AUTHCODE_EXPIRE_TIME/60)});
        return "redirect:/qwq";
    }

    //短信验证 （暂未完成）
    @RequestMapping("/bindalipay")
    public String bindalipay(@RequestParam("userid") Integer userid,
                             @RequestParam("telphone") String telphone,
                             @RequestParam("yzm") String yzm , Map map ){

        //判断用户id 以及 手机号码、验证码 是否为空
        if(userid==null || telphone==null || yzm==null) {
            System.out.println("空");
        }else {
            System.out.println(userid+" | "+telphone+" | "+yzm);

            if (userService.verifyAuthCode(telphone , yzm )){
                System.out.println("(๑•̀ㅂ•́)و✧ 绑定成功.");
                userService.bindalipay(userid , telphone);

            }else {
                System.out.println("绑定失败.");
            }

        }

        return "redirect:/qwq";
    }

}
