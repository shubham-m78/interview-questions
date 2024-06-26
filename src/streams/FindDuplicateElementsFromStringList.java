package streams;

import java.util.*;
import java.util.stream.Stream;

public class FindDuplicateElementsFromStringList {

    static void duplicateElementsInList() {
        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "A", "B", "C", "D", "D", "D");

        List<String> uniqueList = new ArrayList<>();
        List<String> duplicateList = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();
        for (String element : stringList) {
            if (map.containsKey(element)) {
                int count = map.get(element);
                map.put(element, count +
                        1);
                duplicateList.add(element + count);
            } else {
                uniqueList.add(element);
                map.put(element, 1);
            }
        }

        System.out.println("Original List:" + stringList);
        System.out.println("Map:" + map);
        System.out.println("Unique List: " + uniqueList);
        System.out.println("Duplicate List: " + duplicateList);
    }

    static void duplicateElementsInListUsingStreams() {
        Set<String> set = new HashSet<>();

        Stream.of("A", "B", "C", "D", "D", "D")
                .filter(s -> !set.add(s))
                .forEach(System.out::println);
    }

    static void uniqueElementsInListUsingStreams() {
        Set<String> set = new HashSet<>();

        Stream.of("A", "B", "C", "D", "D", "D")
                .filter(set::add)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        duplicateElementsInList();
        duplicateElementsInListUsingStreams();
        uniqueElementsInListUsingStreams();
    }
}
