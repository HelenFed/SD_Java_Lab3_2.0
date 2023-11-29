package com.lab111.labwork3;

/**
 * Клас, який представляє собою одину з примітивних фігур - коло, шляхом розширення класу BaseShape.
 * Визначає додатковий атрибут - radius і реалізує відповідні методи для знаходження ширини та висоти кола.
 * Координати визначаються в конструкторі.
 * Має метод printInfo для виведення конкретної інформації про коло.
 *
 */

public class Circle extends BaseShape{
	public int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public int getWidth() {
		return radius * 2;
	}

	@Override
	public int getHeight() {
		return radius * 2;
	}

	public void printInfo() {
		System.out.printf("Circle x-coordinate: %d\n", x);
		System.out.printf("Circle y-coordinate: %d\n", y);
		System.out.printf("Circle width: %d\n", getWidth());
		System.out.printf("Circle height: %d\n\n", getHeight());
	}
}