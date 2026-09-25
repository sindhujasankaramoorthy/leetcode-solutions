class Solution {
    static boolean[] vis;
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> graph=new ArrayList<>();
        int n=isConnected.length;
        vis=new boolean[n+1];

        for(int i=0;i<=n;i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(isConnected[i][j] == 1) {
                    graph.get(i + 1).add(j + 1);
                }
            }
        }
        int provinces=0;

        for(int i=1;i<=n;i++) {
            if(!vis[i]) {
                provinces++;
                bfs(i,graph);
            }
        }
        return provinces;
    }

    public void bfs(int n,List<List<Integer>> graph) {
        Queue<Integer>  q=new LinkedList<>();
        q.add(n);
        vis[n]=true;

        while(!q.isEmpty()) {
            int curr=q.poll();
            for(int next: graph.get(curr)) {
                if(!vis[next]) {
                    vis[next]=true;
                    q.add(next);
                }
            }
        }
    }
}