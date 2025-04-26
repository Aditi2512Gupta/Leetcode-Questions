import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        int[] sMap = new int[256];
        int[] tMap = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if (sMap[c1] != tMap[c2]) {
                return false;
            }
            
            sMap[c1] = i + 1;
            tMap[c2] = i + 1;
        }
        
        return true;
    }
}



        /*if (s.length() != t.length()) return false;
        
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            if (mapS[s.charAt(i)] != mapT[t.charAt(i)]) return false;
            mapS[s.charAt(i)] = i + 1;
            mapT[t.charAt(i)] = i + 1;
        }
        
        return true;*/
