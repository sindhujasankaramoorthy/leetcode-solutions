class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for(int x : arr) {
            total += x;
        }

        if(total % 3 !=0) return false;

        int part = total / 3;
        int pSum = 0, c = 0;

        for(int x : arr) {
            pSum += x;

            if(pSum == part) {
                c++;
                pSum = 0;
            }
        }

        return c>=3;
    }
}