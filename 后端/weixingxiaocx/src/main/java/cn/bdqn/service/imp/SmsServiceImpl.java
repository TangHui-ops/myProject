package cn.bdqn.service.imp;

import cn.bdqn.mbg.model.Smspeizhi;
import cn.bdqn.service.SmsSerevice;
import com.cloopen.rest.sdk.CCPRestSmsSDK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class SmsServiceImpl implements SmsSerevice {

    @Autowired
    private Smspeizhi smspeizhi;

    @Override
    public void send(String to, String templateId, String[] datas) {

        HashMap<String , Object> result = null;
        CCPRestSmsSDK restAIP = new CCPRestSmsSDK();

        //初始化服务器地址和端口
        restAIP.init(smspeizhi.getServer() , smspeizhi.getServerPort());

        //初始化主账号名称和主账号令牌 ， 登录容联云网站后即可获取 ，q 926431686
        restAIP.setAccount(smspeizhi.getAccountID() , smspeizhi.getAuthToken());

        //配置管理台控制中心已创建的appid
        restAIP.setAppId(smspeizhi.getAppID());

        //设置需要发送 手机号码和发送的验证码（暂时设置固定）
        result = restAIP.sendTemplateSMS( to , templateId , datas );



    }
}
