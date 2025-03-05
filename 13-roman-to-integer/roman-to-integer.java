class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int currValue = 0;
            
            if (c == 'I') currValue = 1;
            else if (c == 'V') currValue = 5;
            else if (c == 'X') currValue = 10;
            else if (c == 'L') currValue = 50;
            else if (c == 'C') currValue = 100;
            else if (c == 'D') currValue = 500;
            else if (c == 'M') currValue = 1000;
            
            if (currValue < prevValue) {
                total -= currValue;
            } else {
                total += currValue;
            }
            prevValue = currValue;
        }
        
        return total;
    }
}