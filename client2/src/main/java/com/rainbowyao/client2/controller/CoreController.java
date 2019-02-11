package com.rainbowyao.client2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: rainbowyao
 * @Date: 2019/1/31 15:36
 * @Description:
 */
@RestController
public class CoreController {

    @RequestMapping("/")
    String home(){
        return "Msg from Client - 2 | Port 7003";
    }
}
