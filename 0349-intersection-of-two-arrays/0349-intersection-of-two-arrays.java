class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int x:nums1){
            set.add(x);
        }
        for(int x:nums2){
            if(set.contains(x)){
                list.add(x);
            }
            set.remove(x);
        }
        int n = list.size();
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}