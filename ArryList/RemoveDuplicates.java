
//input = [1, 2, 2, 3, 4, 3, 5, 1]

//output = [1, 2, 3, 4, 5]

import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for (int num : list) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 3, 5, 1);
        List<Integer> unique = removeDuplicates(nums);
        System.out.println("Original List: " + nums);
        System.out.println("After Removing Duplicates: " + unique);
    }
}
