class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max = piles[0];
        for (int i = 0; i < piles.length; i++) {
            if (max < piles[i]) {
                max = piles[i];
            }
        }
        int l = 1;
        int r = max;
        int ans = max;
        while (l <= r) {
            int mid = l+(r - l) / 2;
            long t = hours(piles, mid);
            if (t <= h) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;

    }

    public long hours(int[] piles, int k) {
        long time = 0;
        for (int i = 0; i < piles.length; i++) {
            time += (piles[i] + k - 1) / k;
        }
        return time;
    }
}