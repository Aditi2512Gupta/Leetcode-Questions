class Solution {
    public int[] plusOne(int[] digits) {
       int n = digits.length;

        // Traverse from the last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // Increment and return if the digit is less than 9
                return digits;
            }
            digits[i] = 0;  // If digit is 9, set it to 0
        }

        // If all digits were 9, we need an extra leading 1
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits; 
    }
}