package HW_11_5;

//Завдання 5 +
//        Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) який "перемішує"
//        елементи зі стрімів first та second, зупиняючись тоді,
//        коли у одного зі стрімів закінчаться елементи.

import java.util.Iterator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> secondStream = Stream.of(6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Stream<Integer> result = zip(firstStream, secondStream);
        result.forEach(s -> System.out.print(s + " "));
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream.Builder<T> builder = Stream.builder();
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        while(iterator1.hasNext() && iterator2.hasNext()) {
            builder.accept(iterator1.next());
            builder.accept(iterator2.next());
        }
        return builder.build();
    }
}

