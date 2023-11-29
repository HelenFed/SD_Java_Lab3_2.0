package com.lab111.labwork3;

/**
 * Абстрактний клас, який реалізує базовий функціонал для отримання координат примітиву.
 * Цей клас наслідують конкретні фігури - коло, прямокутник і крапка
 */

abstract class BaseShape implements Component_Shape{
	public int x;
	public int y;

	BaseShape(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getWidth() {
		return 0;
	}

	@Override
	public int getHeight() {
		return 0;
	}
}
