package com.example.cy.demo;

import com.example.cy.demo.javabean.FunctionService;
import com.example.cy.demo.javabean.UseFunctionService;
import com.example.cy.demo.jsr250.BeanWayService;
import com.example.cy.demo.jsr250.JSR250WayService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.example.cy.demo")
public class CyConfig{

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService UseFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

    @Bean(initMethod="init",destroyMethod="destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}