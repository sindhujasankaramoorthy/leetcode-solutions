class Solution {
    public int deleteAndEarn(int[] nums) {
        int max=nums[0];

        for(int i=1;i<nums.length;i++) {
            if(max<nums[i]){
                max=nums[i];
            }
        }

        int[] dp=new int[max+1];
        int[] price=new int[max+1];

        for(int i=0;i<nums.length;i++) {
            price[nums[i]]+=nums[i];
        }

        if(max>=1) dp[1]=price[1];

        for(int i=2;i<=max;i++) {
            dp[i]=Math.max(
                dp[i-1],price[i]+dp[i-2]
            );
        }
        return dp[max];
    }
}