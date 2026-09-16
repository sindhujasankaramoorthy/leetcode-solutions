class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++) {
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }

        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[n];
        vis[source]=true;
        q.add(source);

        while(!q.isEmpty()) {
            int d=q.poll();
            if (d == destination) {
                return true;
            }

            for(int next:graph.get(d)){
                if(!vis[next]) {
                    vis[next]=true;
                    q.add(next);
                }
            }
        }

        return false;
    }
}