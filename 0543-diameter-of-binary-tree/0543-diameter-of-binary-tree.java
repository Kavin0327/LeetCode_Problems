class Solution {
    private int diameter = 0;
    public int getHeight(TreeNode root){
        if(root == null)
            return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        diameter = Math.max(diameter,leftHeight+rightHeight);
        return Math.max(leftHeight,rightHeight)+1; 
    }
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        getHeight(root);
        return diameter;
    }
}