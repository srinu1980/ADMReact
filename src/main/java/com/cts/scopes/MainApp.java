package com.cts.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/cts/scopes/Beans.xml");

		HelloWorld objA = context.getBean("helloWorld", HelloWorld.class);
		objA.setMessage("I'm object A");
		objA.getMessage();

	}
}
