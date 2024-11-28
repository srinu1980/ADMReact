package com.cts.SpringProject.annotationbasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.SpringProject.javabasedconfig.AppConfig;
import com.cts.SpringProject.javabasedconfig.ClassABC;
import com.cts.SpringProject.javabasedconfig.ClassXYZ;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ClassABC classABC = context.getBean(ClassABC.class);

		System.out.println(classABC);

		ClassXYZ classXYZ = context.getBean(ClassXYZ.class);

		System.out.println(classXYZ);
	}
}
