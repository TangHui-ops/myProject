package cn.bdqn.controller;

import cn.bdqn.mbg.model.Trade;
import cn.bdqn.mbg.model.User;
import cn.bdqn.service.TradeService;
import cn.bdqn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class test {
    @Autowired
    private TradeService tradeService;
    @Autowired
    private UserService userService;
    @RequestMapping("/Trade")
    public User test(Integer id,BigDecimal n){
      User u=userService.selectUser(id);
        if(u!=null){
            //插入这条数据
            Trade r=new Trade();
            r.setTradeMoney(n);
            r.setTradeP(id);
            Date date = new Date();
            SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
            System.out.println(dateFormat.format(date));
            Date Time=date;
            r.setTradeTime(Time);
           boolean i=tradeService.insertSelective(r);
            if(i)
            //修改余额
            { User user=new User();
                user.setUserId(r.getTradeP());
                user.setUserBalance(u.getUserBalance().add(r.getTradeMoney()));
                System.out.println("============"+user.getUserSf());
                if(userService.updateUser(user)){
                    User v=userService.selectUser(id);
                    return v;
                }
            }
            else
                return null;
        }
        return null;

}  @RequestMapping("/money")
    public User jiy(Integer id,BigDecimal n){
        User u=userService.selectUser(id);
        if(u!=null){
            //插入这条数据
            Trade r=new Trade();
            r.setTradeMoney(n);
            r.setTradeP(id);
            Date date = new Date();
            SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
            System.out.println(dateFormat.format(date));
            Date Time=date;
            r.setTradeTime(Time);
            boolean i=tradeService.insertSelective(r);
            if(i)
            //修改余额
            { User user=new User();
                user.setUserId(r.getTradeP());
                System.out.println("======="+u.getUserBalance());
                user.setUserBalance(u.getUserBalance().subtract(r.getTradeMoney()));
                System.out.println("============"+user.getUserSf());
                if(userService.updateUser(user)){
                    User v=userService.selectUser(id);
                    return v;
                }
            }
            else
                return null;
        }
        return null;

    }

}
