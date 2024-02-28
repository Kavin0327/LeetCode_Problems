class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int answer = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            answer = queue.peek().val;
            for(int i=0;i<size;i++){
                TreeNode tmp = queue.poll();
                if(tmp.left != null)
                    queue.add(tmp.left);
                if(tmp.right != null)
                    queue.add(tmp.right);
            }
        }
        return answer;
    }
}