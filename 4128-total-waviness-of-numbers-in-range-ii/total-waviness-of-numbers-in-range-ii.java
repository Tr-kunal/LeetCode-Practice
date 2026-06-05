class Solution {
    String s;
    long[][][][][] dp;

    public long totalWaviness(long l, long r) {
        return calc(r) - calc(l - 1);
    }

    long calc(long x) {
        if (x < 0) return 0;
        s = String.valueOf(x);
        dp = new long[s.length()][11][11][2][2];
        for (var a : dp)
            for (var b : a)
                for (var c : b)
                    for (var d : c)
                        java.util.Arrays.fill(d, -1);
        return dfs(0, 10, 10, 0, 1)[1];
    }

    long[] dfs(int pos, int p2, int p1, int started, int tight) {
        if (pos == s.length()) return new long[]{1, 0};

        if (tight == 0 && dp[pos][p2][p1][started][0] != -1)
            return new long[]{dp[pos][p2][p1][started][0],
                              dp[pos][p2][p1][started][1]};

        long cnt = 0, wav = 0;
        int lim = tight == 1 ? s.charAt(pos) - '0' : 9;

        for (int d = 0; d <= lim; d++) {
            int nt = (tight == 1 && d == lim) ? 1 : 0;

            if (started == 0 && d == 0) {
                long[] t = dfs(pos + 1, 10, 10, 0, nt);
                cnt += t[0];
                wav += t[1];
            } else {
                int add = (started == 1 && p2 != 10 &&
                        ((p1 > p2 && p1 > d) || (p1 < p2 && p1 < d))) ? 1 : 0;

                long[] t = dfs(pos + 1,
                        started == 0 ? 10 : p1,
                        d, 1, nt);

                cnt += t[0];
                wav += t[1] + add * t[0];
            }
        }

        if (tight == 0) {
            dp[pos][p2][p1][started][0] = cnt;
            dp[pos][p2][p1][started][1] = wav;
        }
        return new long[]{cnt, wav};
    }
}