package com.lab111.labwork3;

/**
 * Клас, створений для перевірки програми. В ньому створюються різні примітивні фігури, з яких потім
 * збирається одна повна композиція, про яку виводиться інформація
 *
 */

public class Client {
	public static void main(String[] args) {
		//Варіант завдання
		int var = 1128 % 12;
		System.out.println("Варіант завдання: " + var + "\n");

		Component_Shape dot = new Dot(5, 5);
		Component_Shape circle = new Circle(20, 20, 5);
		Component_Shape rectangle = new Rectangle(200, 200, 100, 150);
		
		ShapeComposition composition = new ShapeComposition(dot, circle, rectangle);
		composition.printInfo();
	}
}
