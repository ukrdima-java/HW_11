package HW_11_2;

//Завдання 2 +
//        Метод приймає на вхід список рядків (можна взяти список із Завдання 1).
//        Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Dmytro", "Ruslana", "Abetka", "Bear", "Zaz", "Mykola");
        System.out.println(method(names));
    }
    public static List<String> method(List<String> names) {
        return names.stream().
                sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
