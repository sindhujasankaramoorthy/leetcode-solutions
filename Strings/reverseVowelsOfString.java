class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;

        char[] a=s.toCharArray();

        while(i<j){

            while(i<j && "aeiouAEIOU".indexOf(a[i])==-1){
                i++;
            }
            while(i<j && "aeiouAEIOU".indexOf(a[j])==-1){
                j--;
            }
            char t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;j--;
        }
        return new String(a);
    }
}