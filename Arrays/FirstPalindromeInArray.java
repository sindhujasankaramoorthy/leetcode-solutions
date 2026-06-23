class Solution {
    public boolean isPal(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        String res="";
        for(String x:words){
            if(isPal(x)){
                res=x;
                break;
            }
        }
        return res;
    }
}