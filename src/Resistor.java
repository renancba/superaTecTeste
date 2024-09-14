import java.util.HashMap;
import java.util.Map;

public class Resistor {
    private static final Map<Character, String> colorMap = new HashMap<>();

    static {
        colorMap.put('0', "preto");
        colorMap.put('1', "marrom");
        colorMap.put('2', "vermelho");
        colorMap.put('3', "laranja");
        colorMap.put('4', "amarelo");
        colorMap.put('5', "verde");
        colorMap.put('6', "azul");
        colorMap.put('7', "violeta");
        colorMap.put('8', "cinza");
        colorMap.put('9', "branco");
    }

    public static String resistoresCores(String input) {
        String[] parts = input.split(" ");
        String value = parts[0];
        StringBuilder colors = new StringBuilder();

        if (value.contains("k")) {
            value = value.replace("k", "");
            int intValue = (int) (Double.parseDouble(value) * 1000);
            value = String.valueOf(intValue);
        } else if (value.contains("M")) {
            value = value.replace("M", "");
            int intValue = (int) (Double.parseDouble(value) * 1000000);
            value = String.valueOf(intValue);
        }

        colors.append(colorMap.get(value.charAt(0))).append(" ");
        colors.append(colorMap.get(value.charAt(1))).append(" ");

        int multiplier = value.length() - 2;
        colors.append(colorMap.get((char) ('0' + multiplier))).append(" ");

        colors.append("dourado");

        return colors.toString().trim();
    }
}

