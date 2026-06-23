class Solution {
    public int maxArea(int[] height) {
       int water=0,l=0,r=height.length-1;

       while(l<r){
            int len=r-l;
            int h=Math.min(height[l],height[r]);
            int curr_water=h*len;
            water=Math.max(water,curr_water);
            if(height[l]>height[r]) r--;
            else l++; 
       } 
       return water;
    }
}