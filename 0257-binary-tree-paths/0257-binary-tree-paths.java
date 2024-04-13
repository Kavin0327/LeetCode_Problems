class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        if(root.left == null && root.right  == null){
            answer.add(root.val+"");
            return answer;
        }
        DFS(root,"",answer);
        return answer;
    }
    
    public static void DFS(TreeNode root,String path,List<String> answer){
        path+=root.val;
        if(root.left == null && root.right == null){
            answer.add(path);
            return;
        }
        path += "->";
        if(root.left != null)
            DFS(root.left,path,answer);
        if(root.right != null)
            DFS(root.right,path,answer);
    }
}