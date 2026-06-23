
class Solution {
    public int maximumWealth(int[][] accounts) {
        int s;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            s=0;
            for(int j=0;j<accounts[i].length;j++){
                s+=accounts[i][j];
            }
            if(max<s){
                max=s;
            }
        }
        return max;
    }
}