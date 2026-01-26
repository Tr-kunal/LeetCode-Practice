class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        int minAbs = Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            minAbs = Math.min(minAbs, arr[i]-arr[i-1]);
        }

        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1] == minAbs){
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return ans;
    }
}