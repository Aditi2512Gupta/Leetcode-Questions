class Solution {
    public String reverseWords(String s) {
        // TC: O(n), SC: O(n)

        s = new StringBuilder(s).reverse().toString();
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            StringBuilder word = new StringBuilder();
            
            while(i < s.length() && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i++;
            }

            word.reverse();

            if(word.length() > 0)
                ans.append(" ").append(word);
        }

        return ans.substring(1);
    }
}

        // // TC: O(n)
        // String[] words = s.trim().split("\\s+"); 
        // StringBuilder sb = new StringBuilder();
        
        // for (int i = words.length - 1; i >= 0; i--) {
        //     sb.append(words[i]);
        //     if (i > 0) sb.append(" "); 
        // }
        
        // return sb.toString();