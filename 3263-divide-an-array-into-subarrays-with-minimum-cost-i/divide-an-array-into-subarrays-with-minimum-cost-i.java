class Solution {
    public int minimumCost(int[] nums) {
        int start = nums[0];
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(first>nums[i]){
                second = first;
                first = nums[i];
            }else if(second>nums[i]){
                second  = nums[i];
            }
        }
        return start + first + second;
    }
}