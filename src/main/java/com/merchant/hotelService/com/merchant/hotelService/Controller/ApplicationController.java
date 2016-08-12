package com.merchant.hotelService.com.merchant.hotelService.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * Created by yuerte969 on 13/8/2016.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ApplicationController {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationController.class);
    }
}
