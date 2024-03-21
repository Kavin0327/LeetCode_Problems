class Solution {
    // Memoization Approach
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length();
        int m = s2.length();
        int k = s3.length();
        if(n+m != k)
            return false;
        Map<String,Boolean> map = new HashMap<>();
        return helper(s1,s2,s3,0,0,0,n,m,k,map);
    }
    public boolean helper(String s1,String s2,String s3,int index1,int index2,int index3,int n ,int m,int k,Map<String,Boolean> map){
        if(index1 == n && index2 == m && index3 == k)
            return true;
        String hashKey = index1+""+index2+""+index3; // why builder TLE because new key words consums more time complexity
        boolean result = false;
        if(map.containsKey(hashKey)){
            return map.get(hashKey);
        }
        if(index3 < k){
            if((index1 < n && index2 < m) && s1.charAt(index1) == s3.charAt(index3) && s2.charAt(index2) ==  s3.charAt(index3)){
                    result = helper(s1,s2,s3,index1+1,index2,index3+1,n,m,k,map) || helper(s1,s2,s3,index1,index2+1,index3+1,n,m,k,map);
                    map.put(hashKey,result);
                    return  result;
        }
            
        if(index1 < n  && s1.charAt(index1) == s3.charAt(index3)){
            result = helper(s1,s2,s3,index1+1,index2,index3+1,n,m,k,map);
            map.put(hashKey,result);
            return result;
        }
            
        if(index2 < m && s2.charAt(index2) ==  s3.charAt(index3)){
            result = helper(s1,s2,s3,index1,index2+1,index3+1,n,m,k,map); 
            map.put(hashKey,result);
            return result;
        }

        } // s3 .length
        return false;
    }
}