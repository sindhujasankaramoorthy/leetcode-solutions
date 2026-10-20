class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        Set<Integer> set = new HashSet<>();

        while(n!=1) {
            if(!set.add(n)) return false;

            String s=String.valueOf(n);
            int num=0;

            for(int i=0;i<s.length();i++) {
                num+=( Character.getNumericValue(s.charAt(i)) * Character.getNumericValue(s.charAt(i)) );
            }
            n=num;
        }
        return n==1;
    }
}