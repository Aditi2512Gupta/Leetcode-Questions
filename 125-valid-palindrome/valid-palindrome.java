class Solution {
    public boolean isPalindrome(String s) {
        // 2 Pointer approach: TC: O(n), SC: O(1)

        int st = 0, end = s.length() - 1;

        while(st < end) {
            // Move left pointer forward if it's not alphanumeric
            if(!Character.isLetterOrDigit(s.charAt(st))) {
                st++;
                continue;
            }

            // Move right pointer backward if it's not alphanumeric
            if(!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }

            // Compare characters (convert to lowercase)
            if(Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            st++;
            end--;
        }

        return true;
    }
}