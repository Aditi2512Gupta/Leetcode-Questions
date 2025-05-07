import java.util.*;

public class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.pollFirst(); // remove the smallest if we have more than 3
            }
        }

        return set.size() == 3 ? set.first() : set.last();
    }
}