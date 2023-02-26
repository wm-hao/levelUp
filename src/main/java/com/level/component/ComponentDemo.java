package com.level.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ComponentDemo implements InitializingBean, BeanPostProcessor, DisposableBean {


    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("post construct");
    }

    public ComponentDemo() {
        System.out.println("construct ");
    }

    public void init() {
        System.out.println("xml init");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties");
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean post before");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean post after");
        return bean;
    }


    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void closeMethod() {
        System.out.println("des-method");
    }
}
