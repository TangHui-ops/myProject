package cn.bdqn.service;


import cn.bdqn.mbg.model.SendMessage;

import java.util.List;

public interface SendMessageServices {


    /*显示该用户的通知 根据时间降序排列 最新消息输出在最上*/
    List<SendMessage> SendMessageMapperlist_notice(Integer id);

    /*显示该用户的公告 根据时间降序排列 最新消息输出在最上*/
    List<SendMessage> SendMessageMapperlist_affiche(Integer id);

    /*新增通知  由后台管理员发出*/
    boolean SendMessageMapperadd_notice(SendMessage sendMessage);

    /*新增公告给所有用户新增一条公告*/
    boolean SendMessageMapperadd_affiche(SendMessage sendMessage);

    /*删除公告*/
    boolean SendMessageMapperdelete_affiche(Integer id);

    /*删除通知*/
    boolean SendMessageMapperdelete_notice(Integer id);

    /*显示未读的公告的数量*/
    int SendMessageMappershow_affiche(Integer id);

    /*显示未读的通知数量*/
    int SendMessageMappershow_notice(Integer id);


}
