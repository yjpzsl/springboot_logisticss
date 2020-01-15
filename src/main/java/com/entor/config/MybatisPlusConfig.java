package com.entor.config;

import javax.sql.DataSource;


import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.MybatisXMLLanguageDriver;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;

@Configuration
public class MybatisPlusConfig {

   /**
    *   mybatis-plus分页插件
    */
	  @Bean
	    public PaginationInterceptor paginationInterceptor() {
	        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
	        // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
	        // paginationInterceptor.setOverflow(false);
	        // 设置最大单页限制数量，默认 500 条，-1 不受限制
	        // paginationInterceptor.setLimit(500);
	        return paginationInterceptor;
}
}