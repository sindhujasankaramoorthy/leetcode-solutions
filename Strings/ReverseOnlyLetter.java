class Solution {
    static void swap(char[] a,int i,int j){
        char t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public String reverseOnlyLetters(String s) {
        int i=0,j=s.length()-1;
        char[] a=s.toCharArray();

        while(i<j){
            while(i<j && !Character.isLetter(a[i])){
                i++;
            }
            while(i<j && !Character.isLetter(a[j])){
                j--;
            }
            swap(a,i,j);
            i++;
            j--;
        }
        return new String(a);
    }
}