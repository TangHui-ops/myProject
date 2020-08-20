package cn.bdqn.controller;


import cn.bdqn.mbg.model.After;
import cn.bdqn.mbg.model.AfterType;
import cn.bdqn.service.AfterService;
import cn.bdqn.service.AfterTypeServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.sql.Timestamp;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class adminController {
    @Autowired
    private AfterService afterService;
    @Autowired
    private AfterTypeServcie afterTypeServcie;

    /**
     * 用户根据id来查询数据
     * @param id
     * @return
     */
    @RequestMapping ("/index")
    public List<After>  After(Integer id){

        System.out.println("++++++++++++++++++++++++++++++++++++++进来了");
        //  List<After> a=afterService.seAfter();
        System.out.println(id);
        return afterService.seAfterByid(id);
    }
    @RequestMapping("/type")
    public List<AfterType> Type(){
        System.out.println("++++++++++++++++++++++++++++++++++++++来了");
        return  afterTypeServcie.setAfterTyper();
    }
    @RequestMapping("/upAfter")
    public boolean upAfter(Integer id, Integer afterDp, Integer name) {
        After after = new After();
        after.setAfterId(id);
        after.setAfterDp(afterDp);
         after.setAfterResult(name);
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        System.out.println(dateFormat.format(date));
        Date Time=date;
        after.setAfterTime(date);
//      after.setAfterUserid();
        System.out.println("++++++++++++++++++++++++++++++++++++++来"+Time);
        return afterService.upAfter(after);
        }
        }