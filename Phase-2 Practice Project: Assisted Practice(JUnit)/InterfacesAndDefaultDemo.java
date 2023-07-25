package com.simplilearn.JUnitDemo;

public interface InterfacesAndDefaultDemo {
	
	public void day();
	
	public default void month() {
		System.out.println("It is July");
	}

}
