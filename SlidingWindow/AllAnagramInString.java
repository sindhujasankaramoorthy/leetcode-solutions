class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n1=p.length(),n2=s.length();
        if (p.length() > s.length()) return new ArrayList<>();
        int[] f1=new int[26];
        int[] f2=new int[26];
        List<Integer> l=new ArrayList<>();

        for(int i=0;i<n1;i++){
            f1[p.charAt(i)-'a']++;
            f2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(f1,f2)) l.add(0);

        for(int i=n1;i<n2;i++){
            f2[s.charAt(i)-'a']++;
            f2[s.charAt(i-n1)-'a']--;

            if(Arrays.equals(f1,f2)) l.add(i-n1+1);
        }
        return l;
    }
}