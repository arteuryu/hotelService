package com.merchant.hotelService.com.merchant.hotelService.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yuerte969 on 12/8/2016.
 */
@Controller
@EnableAutoConfiguration
public class TestController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(TestController.class, args);
    }
}
