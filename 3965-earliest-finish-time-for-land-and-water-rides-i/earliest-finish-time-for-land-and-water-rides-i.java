class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int lmin = Integer.MAX_VALUE;
        int wmin = lmin;
        int res = wmin;
        int n = landStartTime.length;
        int m = waterStartTime.length;

        for(int i=0;i<n;i++){
            lmin = Math.min(lmin, landStartTime[i] + landDuration[i]);
        }

        for(int i=0;i<m;i++){
            wmin = Math.min(wmin, waterStartTime[i] + waterDuration[i]);
            res = Math.min(res,Math.max(lmin,waterStartTime[i])+waterDuration[i]);
        }

        for(int i=0;i<n;i++){
            res = Math.min(res,Math.max(wmin,landStartTime[i]) + landDuration[i]);
        }
        return res;
    }
}