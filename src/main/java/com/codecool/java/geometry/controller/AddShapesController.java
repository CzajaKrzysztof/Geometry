package com.codecool.java.geometry.controller;

import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.geometry.reader.Reader;
import com.codecool.java.geometry.view.Viewer;

public class AddShapesController {
    Viewer viewer;
    Reader reader;
    AddShapes addShapes;

    public AddShapesController(Viewer viewer, Reader reader, ShapeList shapes) {
        this.viewer = viewer;
        this.reader = reader;
        this.addShapes = new AddShapes(viewer, reader, shapes);
    }

    public void getShape() {
        viewer.printShapes();
        int option = reader.getOption("Chose shape number", 1, 6);
        switch (option) {
            case 1:
                addShapes.addCircleShape();
                break;
            case 2:
                addShapes.addEquilateralTriangleShape();
                break;
            case 3:
                addShapes.addRectangleShape();
                break;
            case 4:
                addShapes.addRegularPentagonShape();
                break;
            case 5:
                addShapes.addSquareShape();
                break;
            case 6:
                addShapes.addTriangleShape();
                break;
        }
    }
}