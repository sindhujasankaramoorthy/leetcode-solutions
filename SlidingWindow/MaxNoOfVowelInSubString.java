class Solution {
    public boolean isVow(char s){
        return s=='a' || s=='e' || s=='i' || s=='o' || s=='u';
    }

    public int maxVowels(String s, int k) {
        int c=0;
        for(int i=0;i<k;i++){
            if(isVow(s.charAt(i))){
                c++;
            }
        }
        int max=c;
        if(max==k) return max;
        for(int i=k;i<s.length();i++){
            if(isVow(s.charAt(i-k))){
                c--;
            }
            if(isVow(s.charAt(i))){
                c++;
            }
            max=Math.max(max,c);
            if(max==k) return max;
        }
        return max;
    }
}