class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        boolean flag = false;
        int n = nums1.length;
        int m = nums2.length;
        if(n < m){
            for(int x:nums1){
                set.add(x);
            }
            for(int x:nums2){
                if(set.contains(x))
                    return x;
            }
        }else{
            for(int x:nums2){
                set.add(x);
            }
            for(int x:nums1){
                if(set.contains(x))
                    return x;
            }
        }
        return -1;
    }
}