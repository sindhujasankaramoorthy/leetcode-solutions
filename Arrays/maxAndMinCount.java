class Solution {
    public int maximumCount(int[] nums) {
        int n=0,p=0;
        for(int x:nums){
            if(x<0) n++;
            else if(x>0) p++;
        }
        return n>p? n:p;
    }
}