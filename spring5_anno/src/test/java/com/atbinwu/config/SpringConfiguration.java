package com.atbinwu.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//该类是spring的核心配置类
@Configuration
//组件扫描 <context:component-scan base-package="com.atbinwu"/>
@ComponentScan("com.atbinwu")
//引入配置 <import resource=""/>
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {


}
