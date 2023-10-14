package HW_11_1;

//Завдання 1 +
//        Метод приймає на вхід список імен. Необхідно повернути рядок вигляду 1. Ivan, 3. Peter...
//        лише з тими іменами, що стоять під непарним індексом (1, 3 тощо)

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Dmytro", "Ruslana", "Mykola");
        System.out.println(method(names));
    }
    public static String method(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(index -> index % 2 == 0)
                .mapToObj(index -> (index + 1) + ". " + names.get(index) + (index < names.size() - 2 ? ", " : ""))
                .collect(Collectors.joining());
    }
}