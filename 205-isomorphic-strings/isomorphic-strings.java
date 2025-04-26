import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;
        
        Map<Character, Character> map = new HashMap<>();
        Set<Character> mapped = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i); // character from s
            char ct = t.charAt(i); // character from t
            
            if (map.containsKey(cs)) {
                if (map.get(cs) != ct) return false;
            } else {
                if (mapped.contains(ct)) return false;
                map.put(cs, ct);
                mapped.add(ct);
            }
        }
        
        return true;

        

        /*if (s.length() != t.length()) return false;
        
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            if (mapS[s.charAt(i)] != mapT[t.charAt(i)]) return false;
            mapS[s.charAt(i)] = i + 1;
            mapT[t.charAt(i)] = i + 1;
        }
        
        return true;*/
    }
}