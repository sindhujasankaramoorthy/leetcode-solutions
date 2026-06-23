class Solution {
    static void r(int[] a,int s,int e){
        while(s<e){
            int t=a[s];
            a[s]=a[e];
            a[e]=t;
            s++;
            e--;
        }
    }

    public void rotate(int[] nums, int k) {
        k%=nums.length;
        r(nums,0,nums.length-1);
        r(nums,0,k-1);
        r(nums,k,nums.length-1);
    }
}