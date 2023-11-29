package com.lab111.labwork3;

/**
 * Клас, який представляє собою одину з примітивних фігур - крапку, шляхом розширення класу BaseShape.
 * Реалізує відпввідні методи для отримання ширини та висоти крапки. Крапка має заздалегідь визначений розмір,
 * який дорівнює її висоті та ширині. Координати визначаються в конструкторі.
 * Має метод printInfo для виведення конкретної інформації про крапку.
 *
 */

public class Dot extends BaseShape {
	private final int dot_size = 3;

	public Dot(int x, int y) {
		super(x, y);
	}

	@Override
	public int getWidth() {
		return dot_size;
	}

	@Override
	public int getHeight() {
		return dot_size;
	}

	public void printInfo() {
		System.out.printf("Dot x-coordinate: %d\n", x);
		System.out.printf("Dot y-coordinate: %d\n", y);
		System.out.printf("Dot width: %d\n", getWidth());
		System.out.printf("Dot height: %d\n\n", getHeight());
	}
}
