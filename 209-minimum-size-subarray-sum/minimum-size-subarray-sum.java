class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(i<nums.length){
            sum+=nums[i];
            i++;
            while(sum>=target){
                sum-=nums[j];
                min=Math.min(min,i-j);
                j++;
            
            }

        }
        if(min==Integer.MAX_VALUE) return 0;
        else return min;
    }
}