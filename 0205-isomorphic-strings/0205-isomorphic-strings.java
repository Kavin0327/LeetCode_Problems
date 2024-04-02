class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int m1[]=new int[256];
        int m2[]=new int[256];
        for(int i=0;i<n1;i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
           if(m1[a] == 0 && m2[b] == 0){
               m1[a]=b;
               m2[b]=a;
           }
           else if(m1[a] != b){
               return false;
           }
        }
        return true;
    }
}
