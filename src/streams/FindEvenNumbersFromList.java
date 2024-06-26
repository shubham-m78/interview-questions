package streams;

import java.util.Arrays;

public class FindEvenNumbersFromList {

    public static void main(String[] args) {
        Arrays.asList(10, 15, 8, 49, 25, 98, 32)
                .stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
