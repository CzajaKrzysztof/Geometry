package com.codecool.java.geometry.view;

public class Viewer {
    public Viewer() {}

    public void printMenu() {
        System.out.println("Learn Geometry.\n" +
                           "  What do you want to do?\n" +
                           "\t(1) Add new shape\n" +
                           "\t(2) Show all shapes\n" +
                           "\t(3) Show shape with the largest perimeter\n" +
                           "\t(4) Show shape with the largest area\n" +
                           "\t(5) Show formulas\n" +
                           "\t(0) Exit program\n");
    }

    public void printShapes() {
        System.out.println("Chose shape:\n" +
                           "  (1) Circle\n" +
                           "  (2) Equilateral Triangle\n" +
                           "  (3) Rectangle\n" +
                           "  (4) Regular Pentagon\n" +
                           "  (5) Square\n" +
                           "  (6) Triangle");
    }

    public void printQuestion(String question) {
        System.out.print(question + "?: ");
    }

    public void printError(String error) {
        System.out.println(("Error: " + error));
    }

    public void printLine(String line) {
        System.out.println(line);
    }
}