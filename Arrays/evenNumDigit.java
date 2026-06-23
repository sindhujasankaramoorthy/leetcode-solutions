class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int c1=0;
            while(nums[i]>0){
                c1++;
                nums[i]/=10;
            }
            if(c1%2==0){
                c++;
            }
        }
        return c;
    }
}