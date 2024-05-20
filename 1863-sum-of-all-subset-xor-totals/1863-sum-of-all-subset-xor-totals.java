class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        return kavinTrack(nums,0,n,0);
    }
    public int kavinTrack(int nums[],int index,int n,int answer){
        if(index == n)
            return answer;
        int pick = kavinTrack(nums,index+1,n,answer^nums[index]);
        int noPick = kavinTrack(nums,index+1,n,answer);
        return pick+noPick;
    }
}