package cn.bdqn.controller;



import cn.bdqn.mbg.model.SendMessage;
import cn.bdqn.service.SendMessageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/SendMessage")
public class SendMessageController {

    @Autowired
    private SendMessageServices sendMessageServices;

    /**
     * 显示通知
     * @param ID
     * @return
     */
    @RequestMapping("/noticelist")
    public List<SendMessage> SendMessageMapperlist_notice (Integer ID){
        System.out.println("进入的显示通知方法");
        List<SendMessage> list =  sendMessageServices.SendMessageMapperlist_notice(ID);
        return list;
    }

    /**
     * 显示公告
     * @param ID
     * @return
     */
    @RequestMapping("/affichelist")
    public List<SendMessage> SendMessageMapperlist_affiche (Integer ID){
        System.out.println("进入的显示通知公告");
        List<SendMessage> list =  sendMessageServices.SendMessageMapperlist_affiche(ID);
        return list;
    }

    /**
     * 新增通知
     * @param sendMessage
     * @return
     */
    @RequestMapping("/noticeadd")
    public boolean SendMessageMapperadd_notice (SendMessage sendMessage){
        System.out.println("进入新增通知");
        boolean bol =  sendMessageServices.SendMessageMapperadd_notice(sendMessage);
        return bol;
    }

    /**
     * 新增公告  insert into 数据表(userid,adddate) values((select userid from用户表),date);
     * @param sendMessage
     * @return
     */
    @RequestMapping("/afficheadd")
    public boolean SendMessageMapperadd_affiche (SendMessage sendMessage){
        System.out.println("进入新增公告");
        boolean bol =  sendMessageServices.SendMessageMapperadd_affiche(sendMessage);
        return bol;
    }

    /**
     * 显示公告未读数量
     * @param ID
     * @return
     */
    @RequestMapping("/afficheshow")
    public int SendMessageMappershow_affiche (Integer ID){
        System.out.println("进入的显示公告未读数量");
        int i = sendMessageServices.SendMessageMappershow_affiche(ID);
        return i;
    }

    /**
     * 显示通知未读数量
     * @param ID
     * @return
     */
    @RequestMapping("/noticeshow")
    public int SendMessageMappershow_notice (Integer ID){
        System.out.println("显示通知未读数量");
        int i = sendMessageServices.SendMessageMappershow_notice(ID);
        return i;
    }



}
