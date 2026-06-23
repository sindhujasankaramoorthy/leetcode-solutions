class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> l=new HashSet<>();

        for(int x:nums1){
            set.add(x);
        }
        
        for(int x:nums2){
            if(set.contains(x)){
                l.add(x);
            }
        }

        int[] a = new int[l.size()];

        int k = 0;
        for (int x : l) {
            a[k++] = x;
        }

        return a;
    }
}