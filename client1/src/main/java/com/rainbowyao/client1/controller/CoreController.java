package com.rainbowyao.client1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: rainbowyao
 * @Date: 2019/1/31 15:19
 * @Description:
 */
@RestController
public class CoreController {

    @RequestMapping("/")
    String home(){
        return "Msg from Client - 1 | Port 7002";
    }
}
