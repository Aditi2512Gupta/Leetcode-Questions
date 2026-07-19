class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static int mergeSort(int arr[], int st, int end) {
        if(end <= st)
            return 0;

        int mid = st + (end - st) / 2;
        int leftCount = mergeSort(arr, st, mid);
        int rightCount = mergeSort(arr, mid + 1, end);
        int count = merge(arr, st, mid, end);

        return leftCount + rightCount + count;
    }

    public static int merge(int arr[], int st, int mid, int end) {
        int count = 0;
        // count reverse pairs
        int j = mid + 1;
        
        for(int i = st; i <= mid; i++) {
            while(j <= end && (long)arr[i] > 2L * arr[j]) {
                j++;
            }

            count += (j - (mid + 1));
        }
        
        // Normal merge
        int i = st;
        j = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>();

        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            }
            else {
                temp.add(arr[j]);
                j++;
            }
        }

        while(i <= mid) {
            temp.add(arr[i]);
            i++;
        }

        while(j <= end) {
            temp.add(arr[j]);
            j++;
        }

        for(int k = 0; k < temp.size(); k++) {
            arr[st + k] = temp.get(k);
        }

        return count;
    }
}