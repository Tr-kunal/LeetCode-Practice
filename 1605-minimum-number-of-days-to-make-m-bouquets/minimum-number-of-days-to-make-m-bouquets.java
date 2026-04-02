class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) bloomDay.length < (long) m * k)
            return -1;

        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;

        for (int i : bloomDay) {
            l = Math.min(l, i);
            r = Math.max(r, i);
        }
        while (l <= r) {
            int mid = (l + r) / 2;
            if (possible(bloomDay, mid, m, k) == true) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean possible(int[] arr, int day, int m, int k) {
        int c = 0;
        int n = 0;
        for (int i : arr) {
            if (i <= day) {
                c++;
            } else {
                n += c / k;
                c = 0;
            }

        }
        n += c / k;
        return n >= m;
    }
}