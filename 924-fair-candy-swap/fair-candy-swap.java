class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int A = 0, B = 0;

        for (int x : aliceSizes)
            A += x;
        for (int x : bobSizes)
            B += x;

        int diff = (A - B) / 2;

        HashSet<Integer> set = new HashSet<>();

        for (int x : bobSizes)
            set.add(x);

        for (int x : aliceSizes) {
            int y = x - diff;

            if (set.contains(y))
                return new int[]{x, y};
        }

        return new int[]{};
    }
}