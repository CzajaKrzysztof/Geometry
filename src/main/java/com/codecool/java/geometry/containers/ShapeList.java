package com.codecool.java.geometry.containers;

import com.codecool.java.geometry.shapes.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeList {
    List<Shape> shapes;

    public ShapeList() {
        shapes = new ArrayList<Shape>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public Shape getShapeAt(int index) {
        return shapes.get(index);
    }

    public String getShapesTable() {
        StringBuilder sb = new StringBuilder();
        final int TOTAL_TABLE_WIDTH = 128;
        int col1 = 3;
        int col2 = 19;
        int col3 = 35;
        int col4 = 9;
        int col5 = 9;
        int col6 = 8;
        int col7 = 37;
        String formaterHead = "|%" + col1 + "s|%-" + col2 +"s|%-" + col3 +"s|%" + col4 +"s|%-" + col5 +"s|%" + col6 +"s|%-" + col7 +"s|\n";
        String formaterLine = "|%" + col1 + "d|%-" + col2 + "s|%-" + col3 + "s|%" + col4 + ".2f|%-" + col5 + "s|%" + col6 + ".2f|%-" + col7 + "s|\n";
        sb.append(String.format(formaterHead, "idx", "Class", "toString", "Perimeter", "formula", "Area", "formula"));
        sb.append("-".repeat(TOTAL_TABLE_WIDTH) + "\n");
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            sb.append(String.format(formaterLine, i, shape.getClass().getSimpleName(), shape.toString(),
                    shape.calculatePerimeter(), shape.getPerimeterFormula(), shape.calculateArea(),
                    shape.getAreaFormula()));
            sb.append("-".repeat(TOTAL_TABLE_WIDTH) + "\n");
        }
        return sb.toString();
    }

    public Shape getLargestShapeByPerimeter() {
        Shape largestPerimeter = null;
        double maxPerimeter = 0;
        for (Shape shape : shapes) {
            if (shape.calculatePerimeter() > maxPerimeter) {
                maxPerimeter = shape.calculatePerimeter();
                largestPerimeter = shape;
            }
        }
        return largestPerimeter;
    }

    public Shape getLargestShapeByArea() {
        Shape largestArea = null;
        double maxArea = 0;
        for (Shape shape : shapes) {
            if (shape.calculateArea() > maxArea) {
                maxArea = shape.calculateArea();
                largestArea = shape;
            }
        }
        return largestArea;
    }
}
