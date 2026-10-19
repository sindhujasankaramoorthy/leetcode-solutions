class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0, t_count = 0;

        for(int x: nums) {
            if(x < target) {
                less++;
            }

            if(x == target) {
                t_count++;
            }
        }

        List<Integer> l = new ArrayList<>();
        
        for(int i=0; i< t_count;i++) {
            l.add(less++);
        }
        return l;
    }
}