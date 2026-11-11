class Solution {
    public String longestPalindrome(String s) {
        if(s== null || s.length() <1) return "";

        int st=0,e=0,maxLen=0;

        for(int i=0;i<s.length();i++) {
            int l1=expandAround(s,i,i); //odd
            int l2=expandAround(s,i,i+1); //even
            int len=Math.max(l1,l2);
            if(len>maxLen) {
                maxLen=len;
                st=i-(len-1)/2;
                e=st+len;
            }
        }
        return s.substring(st,e);
    }

    public int expandAround(String s, int l, int r) {
        while(l>=0 && r<s.length() && s.charAt(l)== s.charAt(r)) {
            l--;
            r++;
        }

        return r-l-1;
    }
}