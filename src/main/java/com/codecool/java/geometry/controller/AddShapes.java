package com.codecool.java.geometry.controller;

import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.geometry.reader.Reader;
import com.codecool.java.geometry.shapes.*;
import com.codecool.java.geometry.view.Viewer;

public class AddShapes {
    Viewer viewer;
    Reader reader;
    ShapeList shapes;

    public AddShapes(Viewer viewer, Reader reader, ShapeList shapes) {
        this.viewer = viewer;
        this.reader = reader;
        this.shapes = shapes;
    }

    private void addShape(Shape shape) {
        shapes.addShape(shape);
    }

    void addCircleShape() {
        float r = reader.getFloatFromUser("Enter radius");
        addShape(new Circle(r));
    }

    void addEquilateralTriangleShape() {
        float a = reader.getFloatFromUser("Enter sides length");
        addShape(new EquilateralTriangle(a));
    }

    void addRectangleShape() {
        float a = reader.getFloatFromUser("Enter side's a length");
        float b = reader.getFloatFromUser("Enter side's b length");
        addShape(new Rectangle(a, b));
    }

    void addRegularPentagonShape() {
        float a = reader.getFloatFromUser("Enter sides length");
        addShape(new RegularPentagon(a));
    }

    void addSquareShape() {
        float a = reader.getFloatFromUser("Enter side's length");
        addShape(new Square(a));
    }

    void addTriangleShape() {
        float a = reader.getFloatFromUser("Enter side's a length");
        float b = reader.getFloatFromUser("Enter side's b length");
        float c = reader.getFloatFromUser("Enter side's c length");
        addShape(new Triangle(a, b, c));
    }
}