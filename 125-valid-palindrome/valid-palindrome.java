class Solution {
    public boolean isPalindrome(String s) {

        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move left pointer forward if it's not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer backward if it's not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters (convert to lowercase)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;


       /* StringBuilder filtered = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }

        /*String filtered = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered += Character.toLowerCase(c); // Creates a new String object each time
            }
        }

        return filtered.toString().equals(filtered.reverse().toString());*/
    }
}