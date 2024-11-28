package com.cts.SpringProject.xmlconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		BeanClass bean = (BeanClass) context.getBean("BeanId");

		bean.displayProperty();
	}
}
