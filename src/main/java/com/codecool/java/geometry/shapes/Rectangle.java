package com.codecool.java.geometry.shapes;

public class Rectangle extends Shape {
    private float a;
    private float b;

    public Rectangle() {}
    
    public Rectangle(float a, float b) {
        if (Shape.checkIfArgsGreaterThanZero(a, b)) {
            this.a = a;
            this.b = b;
        }
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public String getAreaFormula() {
        return "a×b";
    }

    @Override
    public String getPerimeterFormula() {
        return "2a + 2b";
    }

    @Override
    public String toString() {
        return String.format("Rectangle, a = %.1f, b = %.1f", a, b);
    }
}
