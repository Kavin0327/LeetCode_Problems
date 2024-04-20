class Solution {
    TreeNode parentNode;
    public boolean Search(TreeNode root,int tar,TreeNode curr){
        if(root == null) 
            return false;
        if(root.val == tar && root != curr)
            return true;
        if(root.val > tar){
            return Search(root.left,tar,curr);
        }
        else{
            return Search(root.right,tar,curr);
        }
    }
    public boolean twoSum(TreeNode root,int k){
        if(root == null)
            return false;
        int diff = k - root.val;
        if(Search(parentNode,diff,root))
            return true;
        return twoSum(root.left,k)||twoSum(root.right,k);
            
    }
    public boolean findTarget(TreeNode root, int k) {
       parentNode = root;
        return twoSum(root,k);
    }
}