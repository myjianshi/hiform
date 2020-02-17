package edu.gyc.hiform.config;

import edu.gyc.hiform.interceptor.UserInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 拦截器配置类
 * ，@EnableWebMvc=WebMvcConfigurationSupport，
 * 使用了@EnableWebMvc注解等于扩展了WebMvcConfigurationSupport但是没有重写任何方法。
 * 使用 @EnableWebMvc 注解，需要以编程的方式指定视图文件相关配置；
 * 不会读取 application.properties中的
 * spring.mvc.view.prefix=/WEB-INF/jsp/
 * spring.mvc.view.suffix=.jsp
 * 配置
 */
@Configuration
public class MvcInterceptorConfig extends WebMvcConfigurationSupport {
    @Autowired
    private UserInterceptor userInterceptor;
    //用户登录拦截
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userInterceptor)
                .addPathPatterns("/design");
    }

    //静态资源访问路径
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");

    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }




}
