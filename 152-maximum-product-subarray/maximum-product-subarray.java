class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 1;
        int max2 = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max1==0){
                max1=1;
            }
            if(max2==0){
                max2=1;
            }
            max1 *= nums[i];
            max2 *= nums[nums.length-i-1];
            max = Math.max(max,Math.max(max1,max2));
        }
        return max;
    }
}