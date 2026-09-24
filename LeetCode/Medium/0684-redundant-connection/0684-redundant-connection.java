class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> graph=new ArrayList<>();

        for(int i=0;i<=edges.length;i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++) {
            boolean[]  vis=new boolean[edges.length+1];

            int u=edges[i][0],v=edges[i][1];

            if(dfs(u,v,vis,graph)) {
                return new int[]{u,v};
            } 

            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }
        return new int[]{0,0};
    }

    public boolean dfs(int start,int dest,boolean[] vis,List<List<Integer>> graph) {
        if(start==dest) {
            return true;
        }

        vis[start]=true;
        for(int next:graph.get(start)) {
            if(!vis[next]) {
                if(dfs(next,dest,vis,graph)){
                    return true;
                }
            }
        }
        return false;
    }
}