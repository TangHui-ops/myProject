package cn.bdqn.service;


public interface RedisService {
    //存储数据
    public void set(String key , String value);

    //取出数据
    public String get(String key);

    //设置过期时间
    public void expire(String key , long expire);


}
