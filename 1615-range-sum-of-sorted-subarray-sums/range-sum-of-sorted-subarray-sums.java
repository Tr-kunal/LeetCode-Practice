class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] sum = new int[n*(n+1)/2];
        int k=0;
        for(int i=0;i<n;i++){
            int temp = 0;
            for(int j=i;j<n;j++){
                temp+=nums[j];
                sum[k]=temp;
                k++;
            }
        }
        Arrays.sort(sum);
        int ans=0;
        int MOD = 1_000_000_007;
        for(int i=left-1;i<=right-1;i++){
            ans = (ans + sum[i]) % MOD;
        }
        return ans;
    }
}