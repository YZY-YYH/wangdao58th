package com.cskaoyan.th58.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024/5/13 17:41
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.cskaoyan.th58")
//开启对于aspectj的支持 开关打开
@EnableAspectJAutoProxy
public class SpringConfig {
}
