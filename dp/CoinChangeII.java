class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length,m=amount;
        int[][] dp=new int[n][m+1];

        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }

        for(int i=1;i<m+1;i++){
            if(i%coins[0]==0) dp[0][i]=1;
            else dp[0][i]=0;
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m+1;j++){
                int notTake=dp[i-1][j];
                int take=0;

                if(j>=coins[i]){
                    take=dp[i][j-coins[i]];
                }
                dp[i][j]=take+notTake;
            }
        }
        return dp[n-1][m];
    }
}
