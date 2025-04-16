class Solution {
    public boolean checkRecord(String s) {
        int absents = 0;
        int consecutiveLates = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'A') {
                absents++;
                if (absents >= 2) {
                    return false;
                }
                consecutiveLates = 0; // reset late count
            } else if (ch == 'L') {
                consecutiveLates++;
                if (consecutiveLates >= 3) {
                    return false;
                }
            } else { // 'P'
                consecutiveLates = 0;
            }
        }

        return true;
    }
}