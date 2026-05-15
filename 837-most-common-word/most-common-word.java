class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));

        Map<String, Integer> map = new HashMap<>();

        String ans = "";
        int max = 0;

        for (String w : paragraph.toLowerCase()
                .replaceAll("[^a-z]", " ")
                .split("\\s+")) {

            if (!ban.contains(w)) {

                int count = map.getOrDefault(w, 0) + 1;

                map.put(w, count);

                if (count > max) {
                    max = count;
                    ans = w;
                }
            }
        }

        return ans;

    }
}