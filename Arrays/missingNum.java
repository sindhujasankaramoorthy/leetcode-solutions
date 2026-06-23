class Solution {
    public int missingNumber(int[] nums) {
        int s=0,d=0,n=nums.length;
        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        for(int i=0;i<n+1;i++){
            d+=i;
        }
        return d-s;
    }
}