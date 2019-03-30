package com.codecool.java.geometry.controller;

import com.codecool.java.geometry.reader.Reader;
import com.codecool.java.geometry.shapes.*;
import com.codecool.java.geometry.view.Viewer;

public class ShowFormulasController {
    Viewer viewer;
    Reader reader;

    public ShowFormulasController(Viewer viewer, Reader reader) {
        this.viewer = viewer;
        this.reader = reader;
    }

    public void getShape() {
        viewer.printShapes();
        int option = reader.getOption("Chose shape number", 1, 6);
        switch (option) {
            case 1:
                Shape circle = new Circle();
                showFormula(circle);
                break;
            case 2:
                Shape equilateralTriangle = new EquilateralTriangle();    
                showFormula(equilateralTriangle);
                break;
            case 3:
                Shape rectangle = new Rectangle();    
                showFormula(rectangle);
                break;
            case 4:
                Shape regularPentagon = new RegularPentagon();    
                showFormula(regularPentagon);
                break;
            case 5:
                Shape square = new Square();    
                showFormula(square);
                break;
            case 6:
                Shape triangle = new Triangle();    
                showFormula(triangle);
                break;
        }
    }

    void showFormula(Shape shape) {
        viewer.printLine(String.format("\n%s; Area: %s, perimeter: %s\n",shape.getClass().getSimpleName(), shape.getAreaFormula(), shape.getPerimeterFormula()));
    }
}