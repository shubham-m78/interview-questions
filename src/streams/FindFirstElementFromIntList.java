package streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindFirstElementFromIntList {

    static void findFirst() {
        Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15)
                .findFirst()
                .ifPresent(System.out::println);
    }

    static void findSmallest() {
        Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15)
                .distinct()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    static void findLargest() {
        Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15)
                .distinct()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        findFirst();
        findSmallest();
        findLargest();
    }
}
