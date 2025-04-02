class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder filtered = new StringBuilder();
        
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
        }*/

        return filtered.toString().equals(filtered.reverse().toString());
    }
}