class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        for(int j:hm.keySet()){
            if(hm.get(j)>(n/3)){
                ans.add(j);
            }
        }
        return ans;
    }
}