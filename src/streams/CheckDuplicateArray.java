package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckDuplicateArray {

    static void checkArray(int[] nums) {

        List<Integer> numList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        Set<Integer> numSet = new HashSet<>(numList);

        if (numList.size() == numSet.size()) {
            System.out.println("Array consist distinct elements");
        } else {
            System.out.println("Array consist duplicate elements");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3};
        checkArray(nums);
    }
}
