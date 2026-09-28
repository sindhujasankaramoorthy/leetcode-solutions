class Solution {
    static int[] dr={1,-1,0,0};
    static int[] dc={0,0,-1,1};
    public int slidingPuzzle(int[][] board) {
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<2;i++) {
            for(int j=0;j<3;j++) {
                sb.append(board[i][j]);
            }
        }
        String t = "123450";
        
        Queue<String> q=new LinkedList<>();
        Set<String> vis=new HashSet<>();
        Map<String, Integer> dis= new HashMap<>();

        q.add(sb.toString());
        vis.add(sb.toString());
        dis.put(sb.toString(), 0);

        while(!q.isEmpty()) {
            String curr = q.poll();
            
            if(curr.equals(t)) return dis.get(curr);

            int zero = curr.indexOf('0');
            int r=zero/3, c=zero%3;

            for(int i=0;i<4;i++) {
                int nr=r+dr[i];
                int nc=c+dc[i];

                if(nr>=0 && nr<2 && nc>=0 && nc<3) {
                    int next = nr*3+nc;
                    char[] ch=curr.toCharArray();

                    char temp=ch[zero];
                    ch[zero]=ch[next];
                    ch[next]=temp;

                    String ns=new String(ch);
                    if(!vis.contains(ns)) {
                        vis.add(ns);
                        q.add(ns);
                        dis.put(ns,dis.get(curr)+1);
                    }
                }
            }
        }
        return -1;
    }
}