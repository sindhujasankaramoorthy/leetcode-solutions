class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        
        int t = rob(nums,0,nums.length-2);
        int nt = rob(nums,1,nums.length-1);

        return Math.max(t,nt);
    }

    public int rob(int[] nums,int start, int end) {
        int prev1=0,prev2=0;
        int curr=0;

        for(int i=start; i<=end; i++) {
            curr=Math.max(prev1,prev2+nums[i]);

            prev2=prev1;
            prev1=curr;
        }
        return curr;
    }
}