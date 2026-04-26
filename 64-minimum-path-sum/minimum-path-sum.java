class Solution {
    static int[][] dp;
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return pathSum(m-1,n-1, grid);
    }

    public int pathSum(int m, int n, int[][] grid){
        if(m==0 && n==0) return grid[m][n];
        if(m==-1 || n==-1) return Integer.MAX_VALUE;
        if(dp[m][n]!=-1) return dp[m][n];

        return dp[m][n] = grid[m][n] + Math.min(pathSum(m,n-1,grid), pathSum(m-1,n,grid)); 
    }
}