class Solution {
    public boolean detectCapitalUse(String word) {

        int count = 0;

        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }

        return count == word.length() || 
               count == 0 || 
               (count == 1 && Character.isUpperCase(word.charAt(0)));
    }
}



        // if (word.equals(word.toUpperCase()))
        //     return true;
        // if (word.equals(word.toLowerCase())) 
        //     return true;
        
        // return Character.isUpperCase(word.charAt(0)) &&
        //        word.substring(1).equals(word.substring(1).toLowerCase());
