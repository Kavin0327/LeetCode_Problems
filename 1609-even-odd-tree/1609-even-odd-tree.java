class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            int prev = 0;
            if(level%2 == 0)
                prev = Integer.MIN_VALUE;
            else
                prev = Integer.MAX_VALUE;
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                if(level%2 == 0 && (prev >= curr.val || curr.val%2 == 0))
                    return false;
                if(level%2 == 1 && (prev <=  curr.val|| curr.val%2 == 1))
                    return false;
                prev = curr.val;
                if(curr.left != null)
                    queue.add(curr.left);
                if(curr.right != null)
                    queue.add(curr.right);
            }
            level++;    
        }
        return true;
    }
}