class Solution {
    public boolean validUtf8(int[] data) {
        int n=data.length;
        String[] bin=new String[n];

        for(int i=0;i<n;i++) {
            bin[i] = String.format("%8s", Integer.toBinaryString(data[i]))
                  .replace(' ', '0');
        }
        int[] count=new int[n];

        for(int i=0;i<n;i++) {
            String s=bin[i];
            int c=0;

            for(int j=0;j<s.length();j++) {
                if(s.charAt(j)=='1') c++;
                else break; 
            }

            count[i]=c;
        }

        int i=0;
        while(i<n) {
            if(count[i]==0) {
                i++;
                continue;
            }

            if(count[i]==1 || count[i]>4) {
                return false;
            }

            int req=count[i]-1;

            for(int j=1;j<=req;j++) {
                if(i+j>=n || count[i+j]!=1) {
                    return false;
                }
            } 
            i+=count[i];
        }

        return true;
    }
}