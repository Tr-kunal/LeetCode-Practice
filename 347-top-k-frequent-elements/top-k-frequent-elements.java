class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>> lst = new ArrayList<>(freq.entrySet());
        Collections.sort(lst,(a,b)->b.getValue()-a.getValue());

        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=lst.get(i).getKey();
        }
        return res;

    }
}