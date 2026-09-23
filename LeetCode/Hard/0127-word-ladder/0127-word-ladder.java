class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> words=new HashSet<>(wordList);
        Queue<String> q=new LinkedList<>();
        q.add(beginWord);

        int steps=1;

        while(!q.isEmpty()) {
            int size=q.size();

            for(int i=0;i<size;i++) {
                String curr=q.poll();
                char[] arr=curr.toCharArray();

                for(int j=0;j<arr.length;j++) {
                    char origin=arr[j];

                    for(char ch='a';ch<='z';ch++) {
                        arr[j]=ch;
                        String dumm=new String(arr);

                        if(dumm.equals(endWord) && words.contains(endWord)) {
                            return steps+1;
                        }

                        if(words.contains(dumm)) {
                            words.remove(dumm);
                            q.add(dumm);
                        }
                    }
                    arr[j]=origin;
                }
            }
            steps++;
        }
        return 0;
    }
}