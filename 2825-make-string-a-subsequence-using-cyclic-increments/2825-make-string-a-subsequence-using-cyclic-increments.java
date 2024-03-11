class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        int p1 = 0;
        int p2 = 0;
        int n1 = str1.length();
        int n2 = str2.length();
        while(p1 < n1 && p2 < n2){
            char ch = arr1[p1];
            ch++; // increment or next element
            if(ch > 'z')
                ch = 'a';
            if(arr1[p1] ==  arr2[p2] || arr2[p2] == ch){
                p2++;
            }
            p1++;
        }
        return p2 == n2;
    }
}