package com.merchant.hotelService.com.merchant.hotelService.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuerte969 on 13/8/2016.
 */
@RestController
public class HotelController {
    @RequestMapping("/arteuryu")
    @ResponseBody
    String home() {
        return "Hello Hotel";
    }
}
