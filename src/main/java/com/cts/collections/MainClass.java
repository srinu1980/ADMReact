package com.cts.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cts/collections/collectionBean.xml");

		Emp emp = (Emp) context.getBean("myBean");

		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
		System.out.println(emp.getCourses());
		System.out.println(emp.getAddress());

	}

}
