package HW_11_3;

//Завдання 3 +
//        Є масив:
//        ["1, 2, 0", "4, 5"]
//
//        Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому , наприклад:
//        "0, 1, 2, 4, 5"

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>(Arrays.asList("1, 2, 0", "4, 5"));
        String result = lines.stream()
                .flatMap(line -> Arrays.stream(line.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .reduce((num1, num2) -> num1 + ", " + num2)
                .orElse("");
        System.out.println(result);
    }
}
