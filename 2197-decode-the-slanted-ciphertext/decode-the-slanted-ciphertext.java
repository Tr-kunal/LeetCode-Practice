class Solution {
    public String decodeCiphertext(String s, int rows) {
        if (s.isEmpty()) return s;

        int n = s.length();
        int col = (n + rows - 1) / rows;

        StringBuilder ans = new StringBuilder();

        for (int start = 0; start < col; start++) {
            int r = 0, c = start;
            while (r < rows && c < col) {
                ans.append(s.charAt(r * col + c));
                r++; c++;
            }
        }

        int i = ans.length();
        while (i > 0 && ans.charAt(i - 1) == ' ') i--;
        return ans.substring(0, i);
    }
}