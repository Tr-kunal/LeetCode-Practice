class Solution {
    public int trailingZeroes(int n) {
        int m=0;
        while(n>0){
            n=n/5;
            m+=n;
        }
        return m;
    }
}