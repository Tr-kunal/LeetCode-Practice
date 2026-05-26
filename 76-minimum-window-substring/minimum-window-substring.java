class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";

        int l = 0;
        int res = Integer.MAX_VALUE;
        int r = t.length();
        int start = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (int h = 0; h < s.length(); h++) {
            char ch = s.charAt(h);
            if (freq.containsKey(ch)) {
                if (freq.get(ch) > 0) {
                    r--;
                }
                freq.put(ch, freq.get(ch) - 1);
            }

            while (r == 0) {
                int ans = h - l + 1;
                if (ans < res) {
                    res = ans;
                    start = l;
                }

                char left = s.charAt(l);
                if (freq.containsKey(left)) {
                    freq.put(left, freq.get(left) + 1);

                    if (freq.get(left) > 0) {
                        r++;
                    }
                }
                l++;
            }

        }
        return res == Integer.MAX_VALUE ? "" : s.substring(start, start + res);

    }
}