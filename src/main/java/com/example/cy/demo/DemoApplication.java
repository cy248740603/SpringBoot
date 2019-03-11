package com.example.cy.demo;

import com.example.cy.demo.aop.AopConfig;
import com.example.cy.demo.aop.DemoAnnotationService;
import com.example.cy.demo.aop.DemoMethodService;
import com.example.cy.demo.javabean.UseFunctionService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CyConfig.class);
		// UseService useService = context.getBean(UseService.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		context.close();
		// System.out.printf(useService.sayHelloString("a"));
		System.out.printf(useFunctionService.SayHello("b"));

		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService demoAnnotationService = context2.getBean(DemoAnnotationService.class);
		DemoMethodService demoMethodService = context2.getBean(DemoMethodService.class);
		demoAnnotationService.add();
		demoMethodService.add();
		context2.close();
	}
}
