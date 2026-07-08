class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> mp=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        int c=0;
        for(String st:arr){
            if(mp.get(st)==1) c++;
            if(c==k) return st;
        }
        return "";
    }
}