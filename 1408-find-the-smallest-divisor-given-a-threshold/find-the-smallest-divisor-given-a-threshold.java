class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = Integer.MIN_VALUE;
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            r = Math.max(nums[i], r);
        }

        while(l<=r){
            int mid = l+(r-l)/2;
            int sum=0;
            for(int i:nums){
                sum += (i + mid - 1) / mid;            }
            if(sum<=threshold){
                ans=mid;
                sum = 0;
                r=mid-1;
            }else{
                l=mid+1;
            }

        }
        return ans;

    }
}