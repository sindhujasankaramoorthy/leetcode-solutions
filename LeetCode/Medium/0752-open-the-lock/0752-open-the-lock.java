class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead=new HashSet<>(Arrays.asList(deadends));
        if(dead.contains("0000")) {
            return -1;
        }

        Queue<String> q=new LinkedList<>();
        Set<String> vis=new HashSet<>();

        q.offer("0000");
        vis.add("0000");

        int count=0;
        while(!q.isEmpty()) {
            int size=q.size();

            for(int i=0;i<size;i++) {
                String curr=q.poll();
                if(curr.equals(target)) return count;

                char[] arr=curr.toCharArray();

                for(int j=0;j<4;j++) {
                    char origin=arr[j];

                    arr[j]= origin=='9'? '0': (char) (origin+1);
                    String temp=new String(arr);
                    if(!dead.contains(temp) && !vis.contains(temp)) {
                        q.offer(temp);
                        vis.add(temp);
                    }

                    arr[j]= origin=='0' ? '9': (char) (origin-1);
                    temp=new String(arr);
                    if(!dead.contains(temp) && !vis.contains(temp)) {
                        q.offer(temp);
                        vis.add(temp);
                    }

                    arr[j]=origin;
                }
            }
            count++;
        }
        return -1;
    }
}