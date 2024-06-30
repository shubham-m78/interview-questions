package streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedString {
    public static void main(String[] args) {
        String[] strings = {"Shubham", "Rajul", "Shubham", "Dullu", "Dullu", "Rishabh"};
        printFirstNonRepeatedString(strings);
    }

    private static void printFirstNonRepeatedString(String[] strings) {
        Arrays.stream(strings)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
