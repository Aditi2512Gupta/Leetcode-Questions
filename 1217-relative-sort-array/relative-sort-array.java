class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        
        for (int x : arr1)
            freq[x]++;

        int i = 0;
        
        for (int x : arr2) {
            while (freq[x] > 0) {
                arr1[i++] = x;
                freq[x]--;
            }
        }

        for (int x = 0; x <= 1000; x++) {
            while (freq[x] > 0) {
                arr1[i++] = x;
                freq[x]--;
            }
        }

        return arr1;
    }
}