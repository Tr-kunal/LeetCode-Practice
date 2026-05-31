class Solution {
    public int maximumSum(int[] arr) {
        int noDelete = arr[0];
        int oneDelete = arr[0];
        int res = arr[0];

        for(int i=1;i<arr.length;i++){
            int prevNoDelete = noDelete;
            noDelete = Math.max(noDelete+arr[i],arr[i]);
            oneDelete = Math.max(oneDelete+arr[i],prevNoDelete);
            res = Math.max(res, Math.max(noDelete,oneDelete));
        }
        return res;
    }
}