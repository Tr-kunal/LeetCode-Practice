class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int ans = 0;
        int sum=0;
        int l = 0;
        for(int i:weights){
            l=Math.max(l,i);
            sum+=i;
        }
        int r=sum;
        while(l<=r){
            int mid = l+(r-l)/2;
            int s=0;
            int d=1;
            for(int i:weights){
                if(s+i<=mid){
                    s+=i;
                }else{
                    s=i;
                    d++;
                }
            }
            if(d<=days){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;

    }
}