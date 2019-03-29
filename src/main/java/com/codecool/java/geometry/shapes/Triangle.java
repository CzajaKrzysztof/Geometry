package com.codecool.java.geometry.shapes;

public class Triangle extends Shape {
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        if (Shape.checkIfArgsGreaterThanZero(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    @Override
	public double calculateArea() {
		return 0;
	}

	@Override
	public double calculatePerimeter() {
		return 0;
	}

	@Override
	public String getAreaFormula() {
		return null;
	}

	@Override
	public String getPerimeterFormula() {
		return null;
	}
    
}
