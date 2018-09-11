package com.zcy.wxminiprograms.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

@Configuration
@MapperScan("com.zcy.wxminiprograms.dao")//配置mybatis mapper扫描路径
public class DataSourceConfiguration {

    @Value("${spring.datasource.driver-class-name}")
    private String jdbcDriver;
    @Value("${spring.datasource.url}")
    private String jdbcUrl;
    @Value("${spring.datasource.username}")
    private String jdbcUsername;
    @Value("${spring.datasource.password}")
    private String jdbcPassword;

    //Spring IOC容器 管理 dataSource(注解方式)
    @Bean(name = "dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {

        //创建ComboPooledDataSource对象(存储数据库连接信息)
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        //jdbc驱动
        dataSource.setDriverClass(jdbcDriver);
        //数据库url
        dataSource.setJdbcUrl(jdbcUrl);
        //数据库 用户名
        dataSource.setUser(jdbcUsername);
        //数据库 密码
        dataSource.setPassword(jdbcPassword);
        //自动提交关闭。(关闭连接后,数据库不自动commit)
        dataSource.setAutoCommitOnClose(false);

        return dataSource;
    }
}
