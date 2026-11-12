class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLen = 1, minLen = 1, max = 1, min = 1;

        for(int i=1;i<nums.length;i++) {
            if(nums[i-1] < nums[i]) {
                max++;
            }else {
                max = 1;
            }

            if(nums[i-1] > nums[i]) {
                min++;
            }else {
                min = 1;
            }

            maxLen = Math.max(maxLen, max);
            minLen = Math.max(minLen, min);
        }

        return Math.max(maxLen, minLen);
    }
}