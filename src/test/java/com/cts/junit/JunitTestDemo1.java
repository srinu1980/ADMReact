package com.cts.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitTestDemo1 {

	private String message = "Good Morning!";
	MessageUtil messageUtil = new MessageUtil("Good Morning!");

	@Test
	public void test1() {
		assertEquals(message, messageUtil.getMessage());
	}
}
