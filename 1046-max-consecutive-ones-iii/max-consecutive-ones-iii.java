class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int ans = Integer.MIN_VALUE;
        int zero = 0;
        for(int h=0;h<nums.length;h++){
            if(nums[h]==0) zero++;
            while(zero>k){
                if(nums[l]==0){
                    zero--;
                }
                l++;
            }
            ans = Math.max(ans,h-l+1);
        }
        return ans;
    }
}