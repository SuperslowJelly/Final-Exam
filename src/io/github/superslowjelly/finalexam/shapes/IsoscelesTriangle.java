package io.github.superslowjelly.finalexam.shapes;

import io.github.superslowjelly.finalexam.utilities.Utils;

public class IsoscelesTriangle implements Shape {

    public IsoscelesTriangle(double sides) {
        SIDES = sides;
        HYPOTENUSE = SIDES * Math.sqrt(2);
    }

    private final double SIDES, HYPOTENUSE;

    public double getHypotenuse() {
        return HYPOTENUSE;
    }

    public double getSides() {
        return SIDES;
    }

    @Override
    public double getArea() {
        return SIDES * SIDES / 2;
    }

    @Override
    public void draw(int index) {
        StringBuilder output = new StringBuilder("&0- &fRight Isosceles Triangle ").append(index).append(":\n&e");
        for (int i = 1; i <= SIDES; i++) {
            output.append("  ");
            for (int in = 0; in < i; in++)
                output.append("X ");
            output.append('\n');
        }
        output.append("&0- &fArea: ").append(getArea()).append('\n');
        Utils.outputln(output.toString());
    }
}
