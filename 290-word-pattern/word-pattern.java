class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] w = s.split(" ");

        if (pattern.length() != w.length)
            return false;

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < w.length; i++) {

            char c = pattern.charAt(i);

            if (map1.containsKey(c) && !map1.get(c).equals(w[i]))
                return false;

            if (map2.containsKey(w[i]) && map2.get(w[i]) != c)
                return false;

            map1.put(c, w[i]);
            map2.put(w[i], c);
        }

        return true;
    }
}