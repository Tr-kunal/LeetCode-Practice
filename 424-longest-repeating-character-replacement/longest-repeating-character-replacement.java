class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int ans = 0;
        int max = 0;
        int[] freq = new int[256];
        for(int h=0;h<s.length();h++){
            freq[s.charAt(h)]++;

            max = Math.max(max,freq[s.charAt(h)]);
            while((h-l+1)-max > k){
                freq[s.charAt(l)]--;
                l++;
            }
            ans = Math.max(ans,h-l+1);
        }
        return ans;
    }
}