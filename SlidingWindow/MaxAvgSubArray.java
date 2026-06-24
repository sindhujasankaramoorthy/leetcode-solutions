class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double s=0;
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        double max=s;
        for(int i=k;i<nums.length;i++){
            s+=nums[i]-nums[i-k];
            if(max<s) max=s;
        }
        return max/k;
    }
}