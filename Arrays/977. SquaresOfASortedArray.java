class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1;
        int i=nums.length-1;    
        int[] a=new int[i+1];

        while(l<=r){
            if(Math.abs(nums[l]) < Math.abs(nums[r])){
                a[i--]=nums[r]*nums[r];
                r--;
            }else{
                a[i--]=nums[l]*nums[l];
                l++;
            }
        } 
        return a;
    }
}