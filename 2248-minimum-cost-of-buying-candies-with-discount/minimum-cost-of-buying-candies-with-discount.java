class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        int min = 0;
        int idx=0;
        Arrays.sort(cost);
        for(int i=n-1;i>=0;i--){
            if(idx%3!=2) min+=cost[i];
            idx++;
        }

        return min;
    }
}