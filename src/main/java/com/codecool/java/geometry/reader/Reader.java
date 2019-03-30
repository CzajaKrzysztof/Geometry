package com.codecool.java.geometry.reader;

import com.codecool.java.geometry.view.Viewer;
import java.util.Scanner;

public class Reader {
    private Scanner reader;
    private Validator validator;
    private Viewer viewer;

    public Reader(Viewer viewer){
        this.reader = new Scanner(System.in);
        this.validator = new Validator();
        this.viewer = viewer;
    }

    private String readString(){
        return this.reader.nextLine();
    }

    public int getOption(String question, int start, int end){
        String userInput = "";
        int userInteger = 0;
        boolean answerIsCorrect = false;
        while (!answerIsCorrect){
            this.viewer.printQuestion(question);
            userInput = this.readString();
            if (validator.isNumeric(userInput)){
                userInteger = Integer.parseInt(userInput);
                if (validator.isNumberInRange(start, end, userInteger)){
                    answerIsCorrect = true;
                } else {
                    viewer.printError("Integer needs to be in range of " + start + " and " + end);
                }
            } else {
                viewer.printError("Input needs to be integer");
            }
        }
        return userInteger;
    }

    public float getFloatFromUser(String question){
        String userInput = "";
        float userFloat = 0;
        boolean answerIsCorrect = false;
        while (!answerIsCorrect){
            this.viewer.printQuestion(question);
            userInput = this.readString();
            if (validator.isNumeric(userInput)){
                userFloat = Float.parseFloat(userInput);
                if (userFloat > 0){
                    answerIsCorrect = true;
                } else {
                    viewer.printError("Input neet to be more than 0");
                }
            } else {
                viewer.printError("Input needs to be float");
            }
        }
        return userFloat;
    }
}