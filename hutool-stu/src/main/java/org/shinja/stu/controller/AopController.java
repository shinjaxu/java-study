package org.shinja.stu.controller;

import cn.hutool.core.lang.Console;
import org.shinja.stu.service.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试Hutool的ProxyUtil
 *
 * @Autowired自动注入的是代理对象, 当调用时, 会执行切面内容
 */
@RestController
@RequestMapping("/aop")
public class AopController {
    @Autowired
    private AopService aopService;

    @GetMapping("test1")
    public void test1(){
        aopService.test1();
    }
}
