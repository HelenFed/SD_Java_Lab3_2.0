package com.lab111.labwork3;

/**
 * Клас, який представляє собою одину з примітивних фігур - прямокутник, шляхом розширення класу BaseShape.
 * Визначає атрибути width і height і реалізує відповідні методи для їх отримання.
 * Координати визначаються в конструкторі.
 * Має метод printInfo для виведення конкретної інформації про прямокутник.
 *
 */

public class Rectangle extends BaseShape{
	public int width;
	public int height;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	public void printInfo() {
		System.out.printf("Rectangle x-coordinate: %d\n", x);
		System.out.printf("Rectangle y-coordinate: %d\n", y);
		System.out.printf("Rectangle width: %d\n", getWidth());
		System.out.printf("Rectangle height: %d\n\n", getHeight());
	}
}