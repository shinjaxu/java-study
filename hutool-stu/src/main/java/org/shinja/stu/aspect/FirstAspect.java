package org.shinja.stu.aspect;

import cn.hutool.aop.aspects.SimpleAspect;
import cn.hutool.core.lang.Console;

import java.lang.reflect.Method;

public class FirstAspect extends SimpleAspect{

    @Override
    public boolean before(Object target, Method method, Object[] args) {
        Console.log("hello world");
        return true;
    }
}
