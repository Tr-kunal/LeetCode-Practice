class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int low = 0;
        int max = 0;
        int k;
        for(int high = 0;high<s.length();high++){
            char ch1 = s.charAt(high);
            map.put(ch1,map.getOrDefault(ch1,0)+1);
            k = high-low+1;
            while(k>map.size()){
                char ch2 = s.charAt(low);
                map.put(ch2,map.getOrDefault(ch2,0)-1);
                if(map.get(ch2)==0)map.remove(ch2);
                low++;
                k = high-low+1;
            }
            max = Math.max(max,k);
        }
        return max;
    }
}