class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int product = 1;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i] == 0){
                zeroCount++;
                if(zeroCount > 1)
                    break;
            }else{
                product *= nums[i];
            }
        }
        if(zeroCount > 1){
            for(int i=0;i<n;i++){
                nums[i] = 0;
            }
            return nums;
        }else if(zeroCount == 1){
            for(int i=0;i<n;i++){
                if(nums[i] == 0)
                    nums[i] = product;
                else 
                    nums[i] = 0;
            }
        }
        else{
            for(int i = 0;i<n;i++){
                if(nums[i] == 0)
                    nums[i] = product;
                else
                    nums[i] = product/nums[i];
            }
        }
        return nums;
    }
}