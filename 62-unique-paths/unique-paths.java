class Solution {
    static int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return paths(m,n);
    }
    public int paths(int m, int n){
        if(m==1 && n==1) return 1;
        if(m==0 || n==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        int r = paths(m,n-1);
        int d = paths(m-1,n);
        return dp[m][n] = r+d;
    }
}