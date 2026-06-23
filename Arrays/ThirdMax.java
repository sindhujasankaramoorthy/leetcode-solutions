class Solution {
    public int thirdMax(int[] nums) {
        Long f=null,s=null,t=null;

        for(int n:nums){
            long x=n;
            if((f!=null && f==x) || (s!=null && s==x) || (t!=null && t==x)){
                continue;
            }
            if(f==null || x>f){
                t=s;
                s=f;
                f=x;
            }else if(s==null || x>s){
                t=s;
                s=x;
            }else if(t==null || x>t){
                t=x;
            }
        }
        return t==null? f.intValue():t.intValue();
    }
}