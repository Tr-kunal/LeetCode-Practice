class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                arr.add(grid[i][j]);
            }
        }

        Collections.sort(arr);

        int n = arr.get((arr.size()) / 2);

        int c = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != n) {
                c = c + (Math.abs(arr.get(i) - n) / x);
            }
            if (Math.abs(arr.get(i) - n) % x != 0) {
                return -1;
            }
        }
        return c;

    }
}