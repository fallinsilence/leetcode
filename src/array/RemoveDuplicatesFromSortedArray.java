package array;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 26. Remove Duplicates from Sorted Array
 */

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int num : nums)
            set.add(num);

        Iterator<Integer> iterator = set.iterator();
        for (int i = 0; i < set.size(); i++)
            nums[i] = iterator.next();

        return set.size();
    }
}
