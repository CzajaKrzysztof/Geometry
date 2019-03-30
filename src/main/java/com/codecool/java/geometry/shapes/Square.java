package com.codecool.java.geometry.shapes;

public class Square extends Rectangle {
    public Square() {}
    
    public Square(float a) {
        super(a, a);
    }

    @Override
    public String toString() {
        return String.format("Square, a = %.1f", getA());
    }
}
