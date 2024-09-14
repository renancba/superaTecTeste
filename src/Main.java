import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] testInputs = {
                "10 ohms", "100 ohms", "220 ohms", "330 ohms", "470 ohms",
                "680 ohms", "1k ohms", "2M ohms"
        };

        for (String input : testInputs) {
            System.out.println(input + " => " + Resistor.resistoresCores(input));
        }
        System.out.println();
        int[][] matrix = {
                {1, 2, 3, 1},
                {4, 5, 6, 4},
                {7, 8, 9, 7},
                {7, 8, 9, 7}
        };

        List<Integer> result = Snail.snail(matrix);
        System.out.println(result);
    }
}