class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,p=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int prof=prices[i]-min;
            if(p<prof){
                p=prof;
            }
        }
        return p;
    }
}