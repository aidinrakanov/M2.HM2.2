package com.company;

public class Main {

	private static Printable printable;

	public static void main(String[] args) {
		createObject("Cars").print();
		createObject("Dolls").print();
		createObject("Balls").print();
		createObject("Cars").print();

	}


	public static Printable createObject(String className) {
		switch (className) {
			case "Cars":
				printable = new Cars(500, "белый", "BMW");
				break;
			case "Dolls":
				printable = new Dolls(700, 80, "Barbie");
				break;
			case "Balls":
				printable = new Balls(1000, 4, "Футбольный");
				break;

		}
		return printable;

	}
}
