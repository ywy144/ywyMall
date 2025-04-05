package com.ywy144.ywyMallService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ywy144"})
@MapperScan("com.ywy144.ywyMallDao.mapper")
public class YwyMallServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(YwyMallServicesApplication.class, args);
    }

}
