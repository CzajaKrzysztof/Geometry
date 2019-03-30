package com.codecool.java.geometry.shapes;

public class Triangle extends Shape {
    private float a;
    private float b;
    private float c;

	public Triangle() {}

	public Triangle(float a, float b, float c) {
        if (Shape.checkIfArgsGreaterThanZero(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
	}
	
	public float getA() {
		return a;
	}

	public float getB() {
		return b;
	}

	public float getC() {
		return c;
	}
    @Override
	public double calculateArea() {
        double s = calculatePerimeter()/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public double calculatePerimeter() {
		return a + b + c;
	}

	@Override
	public String getAreaFormula() {
		return "sqrt(s(s-a)(s-b)(s-c)), s = (a+b+c)/2";
	}

	@Override
	public String getPerimeterFormula() {
		return "a + b + c";
	}

	@Override
    public String toString() {
        return String.format("Triangle, a = %.1f, b = %.1f, c = %.1f", a, b, c);
    }
    
}
