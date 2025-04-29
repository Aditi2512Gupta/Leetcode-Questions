import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String reverseVowels(String s) {
        if (s.length() <= 1) return s;

        Set<Character> vowels = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) vowels.add(c);

        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            while (left < right && !vowels.contains(chars[left])) left++;
            while (left < right && !vowels.contains(chars[right])) right--;

            // Swap
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }

        return new String(chars);
    }
}