class Solution {
    public int maxDepth(String s) {
        int d=0, max=0;

        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch=='(') {
                d++;
                max=Math.max(d,max);
            }else if(ch==')') {
                d--;
            }
        }
        return max;
    }
}