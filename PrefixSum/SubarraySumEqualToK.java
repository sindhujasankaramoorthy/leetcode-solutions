 class Solution {
    public int subarraySum(int[] nums, int k) {
        int s=0,c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            s+=nums[i];

            if(map.containsKey(s-k)){
                c+=map.get(s-k);
            }
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return c;
    }
}