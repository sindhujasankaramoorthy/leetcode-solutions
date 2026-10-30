class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, minSize = Integer.MAX_VALUE, s = 0;

        for(int e=0;e<nums.length;e++) {
            sum += nums[e];
            while(sum >= target) {
                minSize = Math.min(minSize, e-s+1);
                sum-= nums[s];
                s++;
            }
        }

        return minSize==Integer.MAX_VALUE? 0 : minSize;
    }
}