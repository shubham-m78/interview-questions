package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsFromIntegerList {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15)
                .stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);
    }
}
