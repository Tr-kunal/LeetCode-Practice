class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length-1;
        while(l<r){
            int area = Math.min(height[l],height[r])*Math.abs(r-l);
            if(area>max){
                max=area;
            }
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}