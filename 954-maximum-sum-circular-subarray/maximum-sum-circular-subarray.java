class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = nums[0];
        int cmin = nums[0];
        int minSum = nums[0];
        int cmax = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            cmax = Math.max(cmax + nums[i], nums[i]);
            maxSum = Math.max(cmax, maxSum);
            cmin = Math.min(cmin + nums[i], nums[i]);
            minSum = Math.min(cmin, minSum);
        }
        if(maxSum<0) return maxSum;
        return Math.max(maxSum, sum - minSum);

    }
}