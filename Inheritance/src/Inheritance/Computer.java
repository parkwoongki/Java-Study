package Inheritance;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Calculator 2");
		return 3.14 * r * r;
	}
}
