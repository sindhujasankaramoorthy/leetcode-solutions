class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> l=new ArrayList<>();
        l.add(-1000000);
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                l.add(i);
            }
        }
        int[] res=new int[s.length()];

        l.add(Integer.MAX_VALUE);
        int k=0,start=l.get(0),end=l.get(1),h=2;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=c){
                res[k++]=Math.min(i-start,end-i);
            }else {
                res[k++]=0;
                start=end;
                end=l.get(h++);
            }
        }
        return res;
    }
}