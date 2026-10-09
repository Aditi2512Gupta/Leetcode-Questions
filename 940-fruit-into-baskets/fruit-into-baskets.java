class Solution {
    public int totalFruit(int[] fruits) {
        int freq[] = new int[fruits.length];
        int l = 0, ans = 0, count = 0;

        for(int r = 0; r < fruits.length; r++) {
            if(freq[fruits[r]]++ == 0)
                count++;

            while(count > 2) {
                if(--freq[fruits[l++]] == 0)
                    count--;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}