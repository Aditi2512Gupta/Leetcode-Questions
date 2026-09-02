class Solution {
    public int lengthOfLongestSubstring(String s) {
        // TC: O(n)

        int l = 0, res = 0;
        HashMap<Character, Integer> mp = new HashMap<>();

        for(int r = 0; r < s.length(); r++) {
            if(mp.containsKey(s.charAt(r))) {
                l = Math.max(mp.get(s.charAt(r)) + 1, l);
            }

            mp.put(s.charAt(r), r);
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}

        // HashMap<Character, Integer> map = new HashMap<>();

        // int left = 0, maxLen = 0;

        // for (int right = 0; right < s.length(); right++) {

        //     char ch = s.charAt(right);

        //     if (map.containsKey(ch) && map.get(ch) >= left) {
        //         left = map.get(ch) + 1;
        //     }

        //     map.put(ch, right);

        //     maxLen = Math.max(maxLen, right - left + 1);
        // }

        // return maxLen;