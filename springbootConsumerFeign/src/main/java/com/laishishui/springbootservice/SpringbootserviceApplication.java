package com.laishishui.springbootservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
@EnableFeignClients
//@RefreshScope //开启配置更新功能
public class SpringbootserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootserviceApplication.class, args);
    }

}
