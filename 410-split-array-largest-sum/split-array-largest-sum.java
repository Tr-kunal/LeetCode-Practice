class Solution {
    public int splitArray(int[] nums, int k) {
        int l = Integer.MIN_VALUE;
        int r = 0;
        int ans =0;
        for (int i : nums) {
            l = Math.max(l, i);
            r += i;
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int sum = 0;
            int c = 1;
            for (int i : nums) {
                if (sum + i > mid) {
                    c++;
                    sum=i;
                } else {
                    sum += i;
                }
            }
            if (c <= k) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return ans;
    }
}