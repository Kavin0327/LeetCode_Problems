class Solution {
    private List<List<Integer>> kavin;
    private Set<List<Integer>> kavin1;
    public List<List<Integer>> permuteUnique(int[] nums) {
        kavin = new ArrayList<>();
        kavin1 = new HashSet<>();
        int n = nums.length;
        permutation(nums,0,n);
        return kavin;
    }
    void Swap(int arr[],int a,int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
    void permutation(int arr[],int index,int n){
        if(index == n-1){
            List<Integer> list = new ArrayList<Integer>();
            for(int i:arr)
                list.add(i);
            if(!kavin1.contains(list)){
                kavin.add(list);
                kavin1.add(list);
            }
            return;
        }
        for(int i=0;i<n;i++){
            Swap(arr,index,i);
            permutation(arr,index+1,n);
            Swap(arr,index,i);
        }
    }
}