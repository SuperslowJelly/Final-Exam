package io.github.superslowjelly.finalexam.shapes;

import io.github.superslowjelly.finalexam.utilities.Utils;

public class Pyramid implements Shape {

    public Pyramid(double height) {
        HEIGHT = height;
        BASE = HEIGHT * 2;
    }

    private final double HEIGHT, BASE;

    public double getHeight() {
        return HEIGHT;
    }

    public double getBase() {
        return BASE;
    }

    @Override
    public double getArea() {
        return BASE * HEIGHT / 2;
    }

    @Override
    public void draw(int index) {
        StringBuilder output = new StringBuilder("&0- &fPyramid ").append(index).append(":\n&e");
        int k = 0;
        for (int i = 1; i <= HEIGHT; i++, k = 0) {
            output.append("  ");
            for (int b = 1; b <= HEIGHT - i; b++)
                output.append("  ");
            while (k != 2 * i - 1) {
                output.append("X ");
                k++;
            }
            output.append('\n');
        }
        output.append("&0- &fArea: ").append(getArea()).append('\n');
        Utils.outputln(output.toString());
    }
}
