class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];

        dp[0]=nums[0];
        if(nums.length==1) return nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        int max=dp[1];

        for(int i=2;i<nums.length;i++) {
            int t=nums[i]+dp[i-2];
            int nt=dp[i-1];
            max=Math.max(t,nt);
            dp[i]=max;
        }
        return max;
    }
}