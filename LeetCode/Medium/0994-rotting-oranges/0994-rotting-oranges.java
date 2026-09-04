class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int fresh = 0;

        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]==2) {
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int[] dr={-1,1,0,0},dc={0,0,-1,1};
        int m=0;

        while(!q.isEmpty() && fresh > 0) {
            int size=q.size();

            for(int i=0;i<size;i++) {
                int[] curr=q.poll();

                int r=curr[0];
                int c=curr[1];

                for(int d=0;d<4;d++) {
                    int nr=r+dr[d];
                    int nc=c+dc[d];

                    if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1) {
                        grid[nr][nc] = 2;
                        fresh--;

                        q.add(new int[]{nr, nc});
                    }
                }
            }
            m++;
        }

        return fresh == 0 ? m : -1;
    }
}