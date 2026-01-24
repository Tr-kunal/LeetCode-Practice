class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                swap(matrix, i, j);
            }
        }
         for (int i = 0; i < m;i++) {
            int l = 0, r = m - 1;
            while (l < r) {
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }

    }
        

    public static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    
}