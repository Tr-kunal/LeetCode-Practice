class Solution {
    public String reverseVowels(String s) {
        char[] w = s.toCharArray();
        String v = "aeiouAEIOU";
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && v.indexOf(w[l]) == -1)
                l++;
            while (l < r && v.indexOf(w[r]) == -1)
                r--;

            char temp = w[l];
            w[l] = w[r];
            w[r] = temp;

            l++;
            r--;
        }
        String str = new String(w);
        return str;
    }
}