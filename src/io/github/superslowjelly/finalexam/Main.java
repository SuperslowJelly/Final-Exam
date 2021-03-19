package io.github.superslowjelly.finalexam;

import io.github.superslowjelly.finalexam.shapes.Shape;
import io.github.superslowjelly.finalexam.utilities.Input;
import io.github.superslowjelly.finalexam.utilities.Utils;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        while (true) {
            Shape shape = Input.getShape("&0- &fPlease enter which shape you'd like to display (Triangle, Pyramid, Rectangle): ");
            if (shape != null) shapes.add(shape);
            else break;
        }
        for (Shape shape : shapes) shape.draw(shapes.indexOf(shape) + 1);
        if (!shapes.isEmpty()) Utils.outputln("&0- &fTotal shapes: " + shapes.size());
    }
}
