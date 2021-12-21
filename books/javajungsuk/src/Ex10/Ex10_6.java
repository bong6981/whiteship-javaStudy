package Ex10;

import java.text.DecimalFormat;

public class Ex10_6 {
    public static void main(String[] args) {
        double number = 1234567.89;
        String[] pattern = {
                "0",
                "#",
                "0.0",
                "#.#",
                "#.#-",
                "-#.#",
                "#,###.##",
                "#,####.##",
                "#E0",
                "0E0",
        };
        for (int i = 0; i < pattern.length; i++) {
            DecimalFormat df = new DecimalFormat(pattern[i]);
            System.out.printf("%19s : %s\n", pattern[i], df.format(number));

        }
    }
}
