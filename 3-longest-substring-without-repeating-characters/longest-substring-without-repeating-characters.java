class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String st = s.substring(i,j+1);
                if(check(st)){
                    ans = Math.max(ans,st.length());
                }else{
                    break;
                }
            }
        }
        return ans;
    }
    private boolean check(String st){
        int[] sw = new int[256];
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            sw[ch]++;
            if(sw[ch]>1){
                return false;
            }
        }
        return true;
    }
}