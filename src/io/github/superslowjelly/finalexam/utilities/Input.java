package io.github.superslowjelly.finalexam.utilities;

import io.github.superslowjelly.finalexam.shapes.IsoscelesTriangle;
import io.github.superslowjelly.finalexam.shapes.Pyramid;
import io.github.superslowjelly.finalexam.shapes.Rectangle;
import io.github.superslowjelly.finalexam.shapes.Shape;

import java.util.Scanner;

public class Input {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static void error() {
        Utils.outputln("&0- &4ERROR! &fPlease try again!");
    }

    // Prompt the user for a double.
    public static double getDouble(String output) {
        Utils.output(output);
        String input = SCANNER.nextLine();
        if (input.matches("[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?"))
            return Double.parseDouble(input);
        else {
            error();
            return getDouble(output);
        }
    }

    // Prompt the user for a shape.
    public static Shape getShape(String output) {
        Utils.output(output);
        String input = SCANNER.nextLine();
        switch (input.toUpperCase()) {
            case "TRIANGLE":
                return new IsoscelesTriangle(getDouble("&0- &fPlease enter the length of the Triangle's sides: "));
            case "PYRAMID":
                return new Pyramid(getDouble("&0- &fPlease enter the height of the pyramid: "));
            case "RECTANGLE":
                return new Rectangle(getDouble("&0- &fPlease enter the width of the rectangle: "), getDouble("&0- &fPlease enter the height of the rectangle: "));
            case "STOP":
            case "KILL":
            case "-1":
                return null;
            default:
                error();
                return getShape(output);
        }
    }
}
