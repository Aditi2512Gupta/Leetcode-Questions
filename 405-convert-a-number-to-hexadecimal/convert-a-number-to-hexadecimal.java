class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        // Use unsigned right shift to handle negatives properly
        while (num != 0) {
            int hexDigit = num & 0xf;  // get last 4 bits
            sb.append(hexChars[hexDigit]);
            num >>>= 4;  // logical right shift
        }

        return sb.reverse().toString();  // reverse to correct order
    }
}