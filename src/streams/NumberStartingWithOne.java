package streams;

import java.util.Arrays;

public class NumberStartingWithOne {

    public static void main(String[] args) {
        Arrays.asList(10, 15, 8, 49, 25, 98, 32)
                .stream()
                .map(s -> s + "")
                .filter(n -> n.startsWith("1"))
                .forEach(System.out::println);
    }
}
