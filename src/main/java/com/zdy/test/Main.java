package com.zdy.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class); //2
		testBean testbean = context.getBean(testBean.class); 
		System.out.println(useFunctionService.SayHello("word"));
		System.out.println(testbean.givemeName("ÄãµÄÃû×Ö"));
		context.close();
	}

}
