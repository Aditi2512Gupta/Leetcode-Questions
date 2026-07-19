class Solution {
    public boolean isAnagram(String s, String t) {
        // TC: O(n)

        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(int value: map.values()) {
            if(value != 0)
                return false;
        }

        return true;
    }
}

        // // TC: O(nlogn)
        // if (s.length() != t.length()) {
        //     return false;
        // }
        
        // char[] sArray = s.toCharArray();
        // char[] tArray = t.toCharArray();
        
        // Arrays.sort(sArray);
        // Arrays.sort(tArray);
        
        // return Arrays.equals(sArray, tArray);
