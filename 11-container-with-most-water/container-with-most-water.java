class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int maxA = 0;

        while(l<r){
            int area = Math.min(height[l],height[r]) * Math.abs(l-r);
            maxA = Math.max(maxA,area);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxA;
    }
}