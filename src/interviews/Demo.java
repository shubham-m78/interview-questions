package interviews;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        String str = "adidas";
        System.out.println(getFirstNonRepeatingChar(str));
    }

    private static char getFirstNonRepeatingChar(String str) {
        // CODE

        char[] charArray = str.toCharArray();


        Map<char[], Long> collect1 = Arrays.asList(charArray)
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> collect = Stream.of(str)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        return 0;
    }
}
