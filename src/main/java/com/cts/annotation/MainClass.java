package com.cts.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/cts/annotation/Bean.xml");

		Student student = context.getBean("student", Student.class);

		System.out.println(student);
	}
}
