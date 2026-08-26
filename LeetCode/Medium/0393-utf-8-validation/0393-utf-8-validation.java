class Solution {
    public boolean validUtf8(int[] data) {
        String[] bin=new String[data.length];

        for(int i=0;i<data.length;i++){
            bin[i]= String.format("%8s", Integer.toBinaryString(data[i])).replace(' ','0');
        }

        int[] count=new int[data.length];

        for(int i=0;i<data.length;i++) {
            int c=0;
            String d=bin[i];

            for(int j=0;j<d.length();j++) {
                if(d.charAt(j)=='1') {
                    c++;
                }else {
                    break;
                }
            } 

            count[i]=c;
        }

        int i=0;


        while(i<data.length) {
            if(count[i]==0) {
                i++;
                continue;
            }

            if(count[i]==1 || count[i]>4) {
                return false;
            }

            int req=count[i]-1;

            for(int j=1;j<=req;j++) {
                if(i+j >= data.length) {
                    return false;
                }
                if(count[i+j]!=1) {
                    return false;
                }
            }
            i+=count[i];
        }
        return true;
    }
}