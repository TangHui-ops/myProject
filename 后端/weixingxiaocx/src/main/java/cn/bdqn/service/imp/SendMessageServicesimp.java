package cn.bdqn.service.imp;

import cn.bdqn.mbg.mapper.SendMessageMapper;
import cn.bdqn.mbg.model.SendMessage;
import cn.bdqn.service.SendMessageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SendMessageServicesimp implements SendMessageServices {

    @Autowired
    private SendMessageMapper sendMessageMapper;


    /*显示该用户的通知 根据时间降序排列 最新消息输出在最上*/
    @Override
    public List<SendMessage> SendMessageMapperlist_notice(Integer id) {
        /*List<SendMessage> list = sendMessageMapper.SendMessageMapperlist_notice(id);*/
        return null;
    }
    /*显示该用户的公告 根据时间降序排列 最新消息输出在最上*/
    @Override
    public List<SendMessage> SendMessageMapperlist_affiche(Integer id) {
        /*List<SendMessage> list = sendMessageMapper.SendMessageMapperlist_affiche(id);*/
        return null;
    }

    /*新增通知  由后台管理员发出*/
    @Override
    public boolean SendMessageMapperadd_notice(SendMessage sendMessage) {
        /*int i= sendMessageMapper.SendMessageMapperadd_notice(sendMessage);*/
        if (1>0){
            return true;
        }else {
            return false;
        }
    }

    /*新增公告给所有用户新增一条公告*/
    @Override
    public boolean SendMessageMapperadd_affiche(SendMessage sendMessage) {
     /*   int i= sendMessageMapper.SendMessageMapperadd_affiche(sendMessage);*/
        if (1>0){
            return true;
        }else {
            return false;
        }
    }

    /*删除公告*/
    @Override
    public boolean SendMessageMapperdelete_affiche(Integer id) {
     /*   int i= sendMessageMapper.SendMessageMapperdelete_affiche(id);*/
        if (1>0){
            return true;
        }else {
            return false;
        }
    }

    /*删除通知*/
    @Override
    public boolean SendMessageMapperdelete_notice(Integer id) {
       /* int i= sendMessageMapper.SendMessageMapperdelete_notice(id);*/
        if (1>0){
            return true;
        }else {
            return false;
        }
    }

    /*显示未读的公告的数量*/
    @Override
    public int SendMessageMappershow_affiche(Integer id) {

        return 1; /*sendMessageMapper.SendMessageMappershow_affiche(id);*/

    }

    /*显示未读的通知数量*/
    @Override
    public int SendMessageMappershow_notice(Integer id) {

        return 1 ;/* sendMessageMapper.SendMessageMappershow_notice(id);*/

    }

}
