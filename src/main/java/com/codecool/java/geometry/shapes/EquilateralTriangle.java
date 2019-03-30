package com.codecool.java.geometry.shapes;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle() {}
    
    public EquilateralTriangle(float a) {
        super(a, a, a);
    }

    @Override
    public String toString() {
        return String.format("Equilateral Triangle, a = %.1f", getA());
    }
}
