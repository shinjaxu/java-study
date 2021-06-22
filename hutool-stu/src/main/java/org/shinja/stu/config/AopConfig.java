package org.shinja.stu.config;

import cn.hutool.aop.ProxyUtil;
import org.shinja.stu.aspect.FirstAspect;
import org.shinja.stu.service.AopService;
import org.shinja.stu.service.impl.AopServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AopConfig {
    @Primary //保证这个对象优先注入
    @Bean
    public AopService aopService() {
        AopService creditService = ProxyUtil.proxy(new AopServiceImpl(), FirstAspect.class);
        return creditService;
    }
}
