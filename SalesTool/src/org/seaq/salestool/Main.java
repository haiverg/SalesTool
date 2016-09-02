package org.seaq.salestool;

public class Main {

	public static void main(String[] args) {
	
		SalesData data = new SalesData();
		displayGreating();
		data.display();
		
	}

	private static void displayGreating() {
		System.out.println("Hello HAPPY SALES PEOLPLE");
		System.out.println("This App Ahows sales data");
	}

}
