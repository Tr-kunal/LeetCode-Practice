class Solution {
    public int minimumDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                if(nums[j] != nums[i]) continue;
                for(int k = j + 1; k < nums.length; k++) {
                    if(nums[j] == nums[k]) {
                        int dist = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                        ans = Math.min(ans, dist);
                    }
                }
            }
        }
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}