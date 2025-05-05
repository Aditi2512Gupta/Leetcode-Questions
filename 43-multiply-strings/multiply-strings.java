class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int m = num1.length(), n = num2.length();
        int[] result = new int[m + n]; // Max possible length

        // Multiply each digit from num1 and num2
        for (int i = m - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';

            for (int j = n - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';

                int mul = digit1 * digit2;
                int pos1 = i + j;     // carry position
                int pos2 = i + j + 1; // actual digit position

                int sum = mul + result[pos2];

                result[pos2] = sum % 10;
                result[pos1] += sum / 10;
            }
        }

        // Convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            // Skip leading zeros
            if (sb.length() == 0 && num == 0) continue;
            sb.append(num);
        }

        return sb.toString();
    }
}