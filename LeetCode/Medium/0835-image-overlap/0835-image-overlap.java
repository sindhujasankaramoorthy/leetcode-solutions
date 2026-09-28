class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        //int n=img1.length, ans =0 ;
        /*List<int[]> a=new ArrayList<>();
        List<int[]> b=new ArrayList<>();

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(img2[i][j] == 1) {
                    b.add(new int[]{i,j});
                }

                if(img1[i][j] == 1) {
                    a.add(new int[]{i,j});
                }
            }
        }

        Map<String, Integer> map =  new HashMap<>();
        for(int[] p1: a) {
            for(int[] p2: b) {
                int r=p2[0] - p1[0];
                int c=p2[1] - p1[1];

                String dum = r+" , "+c;
                int count = map.getOrDefault(dum,0) + 1;
                map.put(dum, count);
                ans = Math.max(ans, count);
            }
        }

        return ans;*/

        /* METHOD 2
        Map<String, Integer> map =  new HashMap<>();

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(img1[i][j]==1) {
                    for(int k=0;k<n;k++) {
                        for(int l=0;l<n;l++) {
                            if(img2[k][l]==1) {
                                int r = k-i;
                                int c = l-j;

                                String s= r+","+c;
                                int count = map.getOrDefault(s,0)+1;
                                map.put(s, count);
                                ans=Math.max(count,ans);
                            }
                        }
                    }
                }
            }
        }
        return ans;*/

        // METHOD 3

        int n = img1.length;

        // Store count of each shift
        int[][] shifts = new int[2 * n][2 * n];

        int maxOverlap = 0;

        // Pick every 1 from img1
        for (int r1 = 0; r1 < n; r1++) {
            for (int c1 = 0; c1 < n; c1++) {

                if (img1[r1][c1] != 1)
                    continue;

                // Pick every 1 from img2
                for (int r2 = 0; r2 < n; r2++) {
                    for (int c2 = 0; c2 < n; c2++) {

                        if (img2[r2][c2] != 1)
                            continue;

                        // Calculate the shift
                        int rowShift = n + r1 - r2;
                        int colShift = n + c1 - c2;

                        // Count this shift
                        shifts[rowShift][colShift]++;

                        // Update maximum overlap
                        maxOverlap = Math.max(
                            maxOverlap,
                            shifts[rowShift][colShift]
                        );
                    }
                }
            }
        }

        return maxOverlap;
    }
}