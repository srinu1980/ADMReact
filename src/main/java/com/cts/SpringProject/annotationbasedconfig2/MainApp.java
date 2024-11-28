package com.cts.SpringProject.annotationbasedconfig2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/cts/SpringProject/annotationbasedconfig2/config.xml");

		Student student = (Student) context.getBean("student");

		System.out.println("Name : " + student.getName());

		System.out.println("Age : " + student.getAge());
	}
}
