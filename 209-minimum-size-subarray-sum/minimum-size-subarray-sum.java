class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int h = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while(h<nums.length){
            sum+=nums[h];
            h++;
            while(sum>=target){
                ans = Math.min(ans,h-l);
                sum-=nums[l];
                l++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}