class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int ans = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
                ans = Math.max(count, ans);
            }
            if (ch == ')') {
                count--;
            }
        }
        return ans;
    }
}