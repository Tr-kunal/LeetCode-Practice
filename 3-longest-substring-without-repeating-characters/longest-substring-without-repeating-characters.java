class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int ans = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for (int h = 0; h < s.length(); h++) {
            char ch = s.charAt(h);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            while (freq.get(ch) > 1) {
                char left = s.charAt(l);
                freq.put(left, freq.get(left) - 1);

                if (freq.get(left) == 0) {
                    freq.remove(left);
                }
                l++;
            }
            ans = Math.max(ans, h - l + 1);

        }
        return ans;
    }
}