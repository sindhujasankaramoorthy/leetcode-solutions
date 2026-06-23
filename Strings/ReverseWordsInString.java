class Solution {
    public String reverseWords(String s) {
        String[] word=s.trim().split("\\s+");
        int i=0,j=word.length-1;

        while(i<j){
            String t=word[i];
            word[i]=word[j];
            word[j]=t;
            i++;
            j--;
        }
        return String.join(" ", word);
    }
}