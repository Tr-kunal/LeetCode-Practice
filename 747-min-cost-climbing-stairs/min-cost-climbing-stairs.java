class Solution {
    public int minCost(int[] cost, int i, int[] dp){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];

        return dp[i]=cost[i] + Math.min(minCost(cost,i+2,dp),minCost(cost,i+1,dp));
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,0,dp), minCost(cost,1,dp));
    }
}