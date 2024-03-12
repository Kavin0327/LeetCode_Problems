class Trie{
    String word;
    boolean isEnd;
    Trie[] trie;
    public Trie(){
        trie = new Trie[26];
        isEnd = false;
        word = "";
    }
    
    public void insert(String S,Trie root){
        int n = S.length();
        Trie temp = root;
        for(int i=0;i<n;i++){
            int index = S.charAt(i)-'a';
            if(temp.trie[index] == null){
                temp.trie[index] = new Trie();
            }
            temp = temp.trie[index]; // next -> address  
        }
        temp.word = S;
        temp.isEnd = true;
    }
    
}
class Solution {
    public void kavinTrack(char grid[][],int r,int c,int n,int m,List<String> answer,Trie root){
        if(r < 0 || c < 0 || r >= n || c >= m || grid[r][c] == '&')
            return;
        char ch = grid[r][c];
        int index = ch-'a';
        if(root.trie[index] == null)
            return;
        root = root.trie[index];
        if(root.word != null && root.isEnd){
            // System.out.println(root.word);
            answer.add(root.word);
            root.word = null; // beacause avoid duplicates  testcase 2
            // return;
        } 
        grid[r][c] = '&';
        //left 
        kavinTrack(grid,r,c-1,n,m,answer,root);
        //right
        kavinTrack(grid,r,c+1,n,m,answer,root);
        //up
        kavinTrack(grid,r-1,c,n,m,answer,root);
        //down
        kavinTrack(grid,r+1,c,n,m,answer,root);
        grid[r][c] = ch;
        
    }
    
    public List<String> findWords(char[][] board, String[] words) {
        List<String> answer = new ArrayList<>();
        Trie root = new Trie();
        // Insertion on Trie 
        for(String word:words){
            root.insert(word,root);
        }
        //DFS traversal
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                kavinTrack(board,i,j,n,m,answer,root);
            }
        }
        return answer;
    }
}