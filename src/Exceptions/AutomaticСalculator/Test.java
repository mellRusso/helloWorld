package Exceptions.AutomaticСalculator;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws DivisionByZeroException, InvalidCharacterException, InvalidFormatException {
        String input = "10 + * 4";

        String[] array = input.split(" ");

        System.out.println(Arrays.toString(array));
        if (!array[0].matches("-?\\d+")) {
            throw new InvalidCharacterException("Содержится некорректный символ");
        }
        int result = Integer.parseInt(array[0]);
        for (int i = 1; i < array.length; i += 2) {
            if ((!array[i - 1].matches("-?\\d+")) || (!array[i].matches("[+\\-*/]")) || (!array[i + 1].matches("-?\\d+"))) {
                throw new InvalidCharacterException("Содержится некорректный символ");
            } else if ((Integer.parseInt(array[i + 1]) == 0)) {
                throw new DivisionByZeroException("Делить на ноль нельзя");
            }
            switch (array[i]) {
                case "+":
                    result += Integer.parseInt(array[i + 1]);
                    break;
                case "-":
                    result -= Integer.parseInt(array[i + 1]);
                    break;
                case "*":
                    result *= Integer.parseInt(array[i + 1]);
                    break;
                case "/":
                    result /= Integer.parseInt(array[i + 1]);
                    break;
            }
        }
        System.out.println(result);
    }
}
