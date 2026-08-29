class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s: strs) {
            // TC: O(m * nlogn)
            // char ch[] = s.toCharArray();
            // Arrays.sort(ch);
            // String sortedS = new String(ch);

            // TC: (m * n)
            int count[] = new int[26];
            for(char ch: s.toCharArray()) {
                count[ch - 'a']++;
            }

            String sortedS = Arrays.toString(count);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }

        return new ArrayList<>(res.values());
    }
}