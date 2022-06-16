package com.atbinwu.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.atbinwu")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
