class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] i : intervals) {
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < i[0]) {
                ans.add(new int[] { i[0], i[1] });
            } else {
                int maxi = Math.max(ans.get(ans.size() - 1)[1], i[1]);
                ans.get(ans.size() - 1)[1] = maxi;
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
