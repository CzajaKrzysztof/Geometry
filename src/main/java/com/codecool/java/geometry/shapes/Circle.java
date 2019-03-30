package com.codecool.java.geometry.shapes;

public class Circle extends Shape {
    private float radius;

    public Circle() {}
    
    public Circle(float radius) {
        if (Shape.checkIfArgsGreaterThanZero(radius)) {
            this.radius = radius;
        }
    }
    
    public float getR() {
		return radius;
	}

    @Override
    public double calculateArea() {
       return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getAreaFormula() {
        return "π×r^2";
    }

    @Override
    public String getPerimeterFormula() {
        return "2×π×r";
    }

    @Override
    public String toString() {
        return String.format("Circle, r = %.1f", radius);
    }
}
