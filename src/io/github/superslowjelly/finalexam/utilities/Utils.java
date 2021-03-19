package io.github.superslowjelly.finalexam.utilities;

public class Utils {

    public static String black = "\u001b[30m", red = "\u001b[31m", green = "\u001b[32m", yellow = "\u001b[33m", blue = "\u001b[34m", magenta = "\u001b[35m", cyan = "\u001b[36m", white = "\u001b[37m", reset = "\u001b[0m";

    public static void outputln(String text) {
        System.out.println(text.replace("&0", black)
                .replace("&4", red)
                .replace("&a", green)
                .replace("&e", yellow)
                .replace("&9", blue)
                .replace("&d", magenta)
                .replace("&b", cyan)
                .replace("&f", white)
                .replace("&r", reset) + reset
        );
    }

    public static void output(String text) {
        System.out.print(text.replace("&0", black)
                .replace("&4", red)
                .replace("&a", green)
                .replace("&e", yellow)
                .replace("&9", blue)
                .replace("&d", magenta)
                .replace("&b", cyan)
                .replace("&f", white)
                .replace("&r", reset) + reset
        );
    }
}
