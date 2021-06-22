package org.shinja.stu.service.impl;

import cn.hutool.core.lang.Console;
import org.shinja.stu.service.AopService;
import org.springframework.stereotype.Service;

@Service
public class AopServiceImpl implements AopService {
    @Override
    public void test1() {
        Console.log("调用#test1方法");
        this.link1();
        this.test2();
    }

    @Override
    public void test2() {
        Console.log("调用#test2方法");
    }

    private void link1(){
        Console.log("其他任务1");
    }
}
