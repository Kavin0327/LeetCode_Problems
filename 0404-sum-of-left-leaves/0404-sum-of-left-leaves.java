class Solution {
    public int SumOfLeaves(TreeNode tree,boolean isLeft){
        if (tree == null) {
      return 0;
    }
    
    // Base case: This is a leaf node.
    if (tree.left == null && tree.right == null) {
      return isLeft ? tree.val : 0;
    }
return SumOfLeaves(tree.left, true) + SumOfLeaves(tree.right, false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return SumOfLeaves(root,false);
    }
}