class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        
        // copy elements from nums1
        for (int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }
        
        // copy elements from nums2
        for (int j = 0; j < n; j++) {
            temp[m + j] = nums2[j];
        }
        
        // sort the combined array
        Arrays.sort(temp);
        
        // put back into nums1
        for (int k = 0; k < m + n; k++) {
            nums1[k] = temp[k];
        }
    }
}

        
        /*int i = m - 1, j = n - 1, k = m + n - 1;
        
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If nums2 still has remaining elements, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }*/