package com.cts.autowired;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String args[]) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/cts/autowired/autowiredBean.xml");

		Emp emp1 = (Emp) context.getBean("emp"); // init method

		System.out.println(emp1);

		context.registerShutdownHook(); // destroy method

	}
}
