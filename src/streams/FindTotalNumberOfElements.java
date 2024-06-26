package streams;

import java.util.stream.Stream;

public class FindTotalNumberOfElements {

    static void totalIntElements() {
        long count = Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15)
                .count();

        System.out.println(count);
    }

    static void totalStringElements() {
        long count = Stream.of("Shubham", "Rajul")
                .count();

        System.out.println(count);
    }

    public static void main(String[] args) {
        totalIntElements();
        totalStringElements();
    }
}
