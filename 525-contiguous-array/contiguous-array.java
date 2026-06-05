class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int zero = 0;
        int one = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }else{
                one++;
            }
            int diff = zero-one;
            if(diff==0){
                ans = Math.max(ans,i+1);
            }
            if(map.containsKey(diff)){
                int len = i-map.get(diff);
                ans = Math.max(ans,len);
            }else{
                map.put(diff,i);
            }
        }
        return ans;
    }
}