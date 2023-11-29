package com.lab111.labwork3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Клас, який представляє композит графічних примітивів
 */

public class ShapeComposition extends BaseShape {
	// Створення списку для компонентів (листків)
	protected List<Component_Shape> leafs = new ArrayList<>();

	/*
	 Конструктор, риймає набір об'єктів Component_Shape (primitives) та передає їх методу add
	 Встановлює базові координати композиту (0, 0).
	 */
	ShapeComposition(Component_Shape... primitives) {
		super(0, 0);
		add(primitives);
	}

	// Один з можливих методів додавання елементів в список, який передбачає додавання одного елемента
	public void add(Component_Shape primitive) {
		leafs.add(primitive);
	}

	// Один з можливих методів додавання елементів в список, який передбачає додавання набору елементів
	public void add(Component_Shape... primitives) {
		leafs.addAll(Arrays.asList(primitives));
	}

	/*
	Метод, який знаходить X-координату композиту.
	Проходиться по всіх елементах у списку leafs та знаходить мінімальну координату X серед всіх об'єктів.
	 */
	@Override
	public int getX() {
		int x = leafs.get(0).getX();
		for (Component_Shape leaf : leafs) {
			if (leaf.getX() < x) {
				x = leaf.getX();
			}
		}
		return x;
	}

	/*
	Метод, який знаходить Y-координату композиту.
	Проходиться по всіх елементах у списку leafs та знаходить мінімальну координату Y серед всіх об'єктів.
	 */
	@Override
	public int getY() {
		int y = leafs.get(0).getY();
		for (Component_Shape leaf : leafs) {
			if (leaf.getX() < y) {
				y = leaf.getY();
			}
		}
		return y;
	}

	/*
	Метод, який знаходить ширину композиту.
	Проходиться по всіх елементах і знаходить суму між шириною елемента та відносним положенням на осі x.
	Якщо у нас налівіша координата x = 5, а найправіший елемент починається з координати 200 і його ширина = 100, то
	ширина композиції = 200 + 100 - 5 = 295
	 */
	@Override
	public int getWidth() {
		int maxWidth = 0;
		int x = getX();
		for (Component_Shape leaf : leafs) {
			int leafRelativeX = leaf.getX() - x;
			int leafWidth = leafRelativeX + leaf.getWidth();
			if (leafWidth > maxWidth){
				maxWidth = leafWidth;
			}
		}
		return maxWidth;
	}

	/*
	Метод, який знаходить висоту композиту.
	Проходиться по всіх елементах і знаходить суму висоти елемента та відносним положенням на осі y.
	Якщо у нас найнижча координата y = 5, а елемент, який вище за усіх починається з координати y = 200, а висота = 150,
	то висотп композиції = 200 + 150 - 5 = 245
	 */
	@Override
	public int getHeight() {
		int maxHeight = 0;
		int y = getY();
		for (Component_Shape leaf : leafs) {
			int leafRelativeY = leaf.getY() - y;
			int leafHeight = leafRelativeY + leaf.getHeight();
			if (leafHeight > maxHeight){
				maxHeight = leafHeight;
			}
		}
		return maxHeight;
	}

	public void printInfo() {
		leafs.forEach(Component_Shape::printInfo);
		System.out.printf("Composition x-coordinate: %d\n", getX());
		System.out.printf("Composition y-coordinate: %d\n", getY());
		System.out.printf("Composition width: %d\n", getWidth());
		System.out.printf("Composition height: %d\n", getHeight());
	}
}
