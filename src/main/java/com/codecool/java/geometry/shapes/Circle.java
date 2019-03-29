package com.codecool.java.geometry.shapes;

public class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        if (Shape.checkIfArgsGreaterThanZero(radius)) {
            this.radius = radius;
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
