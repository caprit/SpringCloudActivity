package com.lynn.blog.register;

//import com.lynn.blog.common.app.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
//@SpringCloudApplication
@SpringBootApplication
public class RegisterApplication /*extends Application*/ {

    public static void main(String[] args) {
        /*Application.startup*/
        SpringApplication.run(RegisterApplication.class,args);
    }
}
