package com.wx.m3;

@ComponentScan(basePackages= "com.wx.m3")//添加扫包@ComponentScan(basePackages= "")
@EnableAutoConfiguration
public class M3Application {

    public static void main(String[] args) {
        SpringApplication.run(M3Application.class, args);
    }

}