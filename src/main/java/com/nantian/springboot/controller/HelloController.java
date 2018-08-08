package com.nantian.springboot.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Package: com.nantian.springboot.controller
 * @Author: sweets_wn
 * @Date: 2018/8/7 17:35
 * @Version V1.0
 * @Copyright: 2018 gitee.com.sweetswn. All rights reserved.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    //private Logger logger = Logger.getLogger(HelloController.class.toString()); //log4j
    private Logger logger = LogManager.getLogger(HelloController.class.getName()); //log4j2

    @RequestMapping("/demo")
    public String demo() {
        return "hello,this is a springboot demo";
    }

    @RequestMapping("/test")
    public String test() {
        logger.error("欢迎使用该系统_ERROR------");
        logger.warn("欢迎使用该系统_WARN------");
        logger.info("欢迎使用该系统_INFO------");
        System.out.println("测试");
        return "test, test, test";
    }
}
