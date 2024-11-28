package com.cts.SpringProject.xmlconfiguration;

public class BeanClass {

	private String property;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public void displayProperty() {
		System.out.println("Hello " + property + "...!");
	}
}
