package com.codecool.java.geometry;

import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.geometry.view.Viewer;
import com.codecool.java.geometry.reader.Reader;
import com.codecool.java.geometry.controller.AddShapesController;
import com.codecool.java.geometry.controller.ShowFormulasController;

public class Main {

    public static void main(String[] args) {
        ShapeList shapes = new ShapeList();
        Viewer viewer = new Viewer();
        Reader reader = new Reader(viewer);
        AddShapesController add = new AddShapesController(viewer, reader, shapes);
        ShowFormulasController show = new ShowFormulasController(viewer, reader);

        boolean isRunning = true;
        while (isRunning) {
            viewer.printMenu();
            int option = reader.getOption("Chose option", 0, 5);

            switch (option) {
            case 1:
                add.getShape();
                break;
            case 2:
                System.out.println(shapes.getShapesTable());
                break;
            case 3:
                System.out.println(String.format("\n\t%s Perimeter: %s\n", shapes.getLargestShapeByPerimeter(),
                        shapes.getLargestShapeByPerimeter().calculatePerimeter()));
                break;
            case 4:
                System.out.println(String.format("\n\t%s Area: %s\n", shapes.getLargestShapeByArea(),
                        shapes.getLargestShapeByPerimeter().calculateArea()));
                break;
            case 5:
                show.getShape();
                break;
            case 0:
                isRunning = false;
                break;

            }
        }
    }
}
