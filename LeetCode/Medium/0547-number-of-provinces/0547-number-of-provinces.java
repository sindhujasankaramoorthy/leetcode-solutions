class Solution {
    int n;
    public int findCircleNum(int[][] isConnected) {
        n=isConnected.length;
        boolean[] vis=new boolean[n];
        int provin=0;

        for(int i=0;i<n;i++) {
            if(!vis[i]) {
                provin++;
                dfs(i,vis,isConnected);
            }
        }
        return provin;
    }

    public void dfs(int node, boolean[] vis, int[][] isConnected) {
        vis[node]=true;
        for(int i=0;i<n;i++) {
            if(!vis[i] && isConnected[node][i] == 1) {
                dfs(i,vis,isConnected);
            }
        }
    }
}