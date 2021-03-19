package io.github.superslowjelly.finalexam.shapes;

import io.github.superslowjelly.finalexam.utilities.Utils;

public class Rectangle implements Shape {

    public Rectangle (double width, double height) {
        WIDTH = width;
        HEIGHT = height;
    }

    private final double WIDTH, HEIGHT;

    public double getWidth() {
        return WIDTH;
    }

    public double getHeight() {
        return HEIGHT;
    }

    @Override
    public double getArea() {
        return WIDTH * HEIGHT;
    }

    @Override
    public void draw(int index) {
        StringBuilder output = new StringBuilder("&0- &fRectangle ").append(index).append(":\n&e");
        for (int h = 0; h < HEIGHT; h++) {
            output.append("  ");
            for (int w = 0; w < WIDTH; w++) {
                output.append("X ");
            }
            output.append('\n');
        }
        output.append("&0- &fArea: ").append(getArea()).append('\n');
        Utils.outputln(output.toString());
    }
}
