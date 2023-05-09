package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= "org.example")//添加扫包@ComponentScan(basePackages= "")
@EnableAutoConfiguration
public class M3Application {

    public static void main(String[] args) {
        SpringApplication.run(M3Application.class, args);
        System.out.println("启动成功...");
    }

}