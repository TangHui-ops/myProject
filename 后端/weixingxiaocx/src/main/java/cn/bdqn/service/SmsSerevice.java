package cn.bdqn.service;

public interface SmsSerevice {
    //短信发送接口
    /*
    * to：接受短信的手机号
    * template：短信的模板id
    * datas：短信中的模板id
    * */
    public void send(String to , String templateId , String[] datas);




}
