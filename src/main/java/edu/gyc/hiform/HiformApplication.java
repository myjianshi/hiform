package edu.gyc.hiform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.gyc.hiform.dao")
public class HiformApplication {

    public static void main(String[] args) {
        SpringApplication.run(HiformApplication.class, args);
    }

}
