package com.merchant.hotelService.com.merchant.hotelService.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuerte969 on 12/8/2016.
 */
@RestController
public class TestController {
    @RequestMapping("/arteur")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
