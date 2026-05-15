class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>();

        for (String b : banned)
            ban.add(b);

        HashMap<String, Integer> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        String ans = "";
        int max = 0;

        paragraph += ".";

        for (char c : paragraph.toCharArray()) {

            if (Character.isLetter(c)) {

                sb.append(Character.toLowerCase(c));

            } else if (sb.length() > 0) {

                String w = sb.toString();

                if (!ban.contains(w)) {

                    int count = map.getOrDefault(w, 0) + 1;

                    map.put(w, count);

                    if (count > max) {
                        max = count;
                        ans = w;
                    }
                }

                sb.setLength(0);
            }
        }

        return ans;
    }
}