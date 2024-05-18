class Solution {
    public int moves;
    public int distributeCoins(TreeNode root) {
        moves = 0;
        findMoves(root);
        return moves;
    }
    public int findMoves(TreeNode root){
        if(root == null)
            return 0;
        int left = findMoves(root.left);
        int right = findMoves(root.right);
        int total = root.val+left+right-1;
        moves += Math.abs(total);
        return total;
    }
}