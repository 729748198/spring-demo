package com.hwj.demo.tools;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author 贺文杰
 * 2018/12/27 12:46
 */
@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager manager) {

        System.out.println("ShiroConfig+ShiroFilter()");
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager((org.apache.shiro.mgt.SecurityManager) manager);

        //拦截器
        Map<String,String> filterChainDefinetionMap=new LinkedHashMap<String, String>();
        filterChainDefinetionMap.put("/logout","logout");
        filterChainDefinetionMap.put("/**","authc");
        shiroFilterFactoryBean.setLoginUrl("/login");

        //跳转成功后链接
        shiroFilterFactoryBean.setSuccessUrl("/index");

        //未授权跳转链接
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinetionMap);

        return  shiroFilterFactoryBean;
    }

    @Bean
    public DefaultWebSecurityManager securityManager(){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        return  securityManager;
    }
}