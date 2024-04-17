class Solution {
    String smallerString;
    public String smallestFromLeaf(TreeNode root) {
        smallerString = "zzzzzzzzzzzzzzzz";
        traversal(root,new StringBuilder());
        return smallerString;
    }
    public String traversal(TreeNode root,StringBuilder str){
        if(root == null){
            return smallerString;
        }
        str.append((char)(root.val+'a'));
        if(root.left == null && root.right == null){
            String currString = str.reverse().toString();
            // System.out.println(currString);
            if(currString.compareTo(smallerString) < 0){
                smallerString = currString;
                // System.out.println(smallerString+" -");
            }
            str.reverse();
        }
        traversal(root.left,str);
        traversal(root.right,str);
        str.deleteCharAt(str.length()-1);
        return smallerString;
    }
}