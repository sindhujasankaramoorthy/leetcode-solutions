class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldCol=image[sr][sc];
        if (oldCol == color) return image;
        
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{sr,sc});
        image[sr][sc]=color;


        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        while(!q.isEmpty()) {
            int[] curr=q.poll();
            int r=curr[0],c=curr[1];

            for(int d=0;d<4;d++) {
                int nr=r+dr[d];
                int nc=c+dc[d];

                if(nr>=0 && nr<image.length && nc>=0 && nc<image[0].length) {
                    if(image[nr][nc]==oldCol) {
                        image[nr][nc]=color;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }

        return image;
    }
}