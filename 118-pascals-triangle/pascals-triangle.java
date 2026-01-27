class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int prev = 1;

            row.add(1);

            for (int j = 1; j < i; j++) {
                prev = (prev * (i - j)) / j;
                row.add(prev);
            }

            ans.add(row);
        }

        return ans;
    }
}