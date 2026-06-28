class Solution {
    public int pivotIndex(int[] nums) {
        int[] pref=new int[nums.length];

        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=nums[i] +pref[i-1];
        }
        int total=pref[nums.length-1],left=0;

        for(int i=0;i<nums.length;i++){
            int right=total-left-nums[i];

            if(left==right){
                return i;
            }
            left=pref[i];
        }
        return -1;
    }
}