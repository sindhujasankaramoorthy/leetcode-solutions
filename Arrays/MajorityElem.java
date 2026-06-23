class Solution {
    public int majorityElement(int[] nums) {
        int max=nums[0],c=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i] ==max){
                c++;
            }else if(nums[i]!=max && c!=0) {
                c--;
            }else if(c==0){
                max=nums[i];
            }
        }
        return max;
    }
}