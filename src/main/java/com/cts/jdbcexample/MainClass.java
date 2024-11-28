package com.cts.jdbcexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/cts/jdbcexample/Bean.xml");

		UserDao dao = (UserDao) ctx.getBean("edao");

		int status = dao.saveUser(new User(100, "Mahi", 90000));

		System.out.println(status + " Record Saved in database.....");
	}
}
