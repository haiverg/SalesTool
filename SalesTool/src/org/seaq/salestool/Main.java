package org.seaq.salestool;

public class Main {

	public static void main(String[] args) {
	
		SalesData data = new SalesData();
		displayGreating();
		data.display();
		
	}

	private static void displayGreating() {
		System.out.println("Hello Happy Sales People");
		System.out.println("This App Shows sales data");
		System.out.println("-------------------------");
		System.out.println("Test1");
		System.out.println("Test2");
	}

}
