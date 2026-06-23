class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) {
                c++;
            }else{
                m=Math.max(m,c);
                c=0;
            }
        }
        m=Math.max(m,c);
        return m;
    }
}