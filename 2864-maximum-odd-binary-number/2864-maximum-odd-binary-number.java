class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length(); 
        char arr[] = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = '0';
        }
        int bits = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '1')
                bits++;
        }
        if(bits > 0){
            arr[n-1] = '1';
            bits--;
        }
        int i = 0;
        while(bits-- > 0){
            arr[i++] = '1';
        }
        return new String(arr);
    }
}