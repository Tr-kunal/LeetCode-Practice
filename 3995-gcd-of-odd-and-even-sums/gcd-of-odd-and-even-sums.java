class Solution {
    public int gcdOfOddEvenSums(int n) {
      int esum=n*(n+1);
      int osum=n*n;
      for(int i=Math.min(esum,osum);i>0;i-- ){
        if(esum%i==0 && osum%i==0)return i;
      } 
      return 1;
    }
}