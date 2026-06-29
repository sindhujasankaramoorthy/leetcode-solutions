class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] right=new int[nums.length];
        right[0]=1;

        for(int i=1;i<nums.length;i++){
            right[i]=right[i-1]*nums[i-1];
        }
        int r=1;
        for(int i=nums.length-1;i>=0;i--){
            right[i]*=r;
            r*=nums[i];
        }
        return right;
    }
}