package com.rainbowyao.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: rainbowyao
 * @Date: 2019/1/31 15:28
 * @Description:
 */
@RestController
@RequestMapping("/ribbon")
public class TestRibbonController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test(){
        String url = "http://regist-client/";
        return restTemplate.getForObject(url, String.class);
    }
}
