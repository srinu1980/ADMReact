package com.cts.SpringProject.annotationbasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");

		AnyClass anyClass = context.getBean(AnyClass.class);

		anyClass.anyMethod();
	}
}
