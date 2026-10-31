class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for(int x: arr) {
            set.add(x*2);
        }

        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] != 0 && set.contains(arr[i])) {
                return true;
            }
        }

        int c = 0;
        for(int x: arr) {
            if(x==0) c++;
        }
        return c>=2;
    }
}