package HW_11_4;

//Завдання 4 +
//        Використовуючи Stream.iterate, створіть безкінечний стрім випадкових чисел, але не використовуючи Math.random().
//
//        Реалізуйте свій лінійний конгруентний генератор. Для цього почніть з x[0] = seed,
//        і далі кожний наступний елемент рахуйте за формулою на зразок x[n + 1] = 1 (a x[n] + c) % m
//        для коректних значень a, c, та m.
//
//        Необхідно імплементувати метод, що приймає на вхід параметри a, c, та m, і повертає Stream<Long>.

//        Для тесту використовуйте такі дані:
//
//        a = 25214903917
//        c = 11
//        m = 2^48 (2в степені48`)

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        Stream<Long> stream = method(a, c, m);
        stream.forEach(System.out::println);
    }
    public static Stream<Long> method(long a, long c, long m) {
        return Stream.iterate(2L, x -> (a * x + c) % m);
    }
}
