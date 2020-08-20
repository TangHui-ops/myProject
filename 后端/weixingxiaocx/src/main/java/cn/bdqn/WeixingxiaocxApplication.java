package cn.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.bdqn.mbg.mapper")
@SpringBootApplication
public class WeixingxiaocxApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeixingxiaocxApplication.class, args);
    }

}
