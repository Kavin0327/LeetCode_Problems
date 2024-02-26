class Trie {
    Trie kavin[];
    int count;
    boolean isEnd;
    public Trie() {
        count = 0;
        kavin = new Trie[26];
        isEnd = false;
    }
    public void insert(Trie trie,String word) {
        Trie temp = trie;
        for(char ch:word.toCharArray()){
            int index = ch-'a';
            if(temp.kavin[index] == null){
                temp.kavin[index] = new Trie(); 
            }
            temp = temp.kavin[index];
        }
        temp.count++;
        temp.isEnd = true;
    }
    public long search(Trie trie,String word) {
        Trie temp = trie;
        long c = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch:word.toCharArray()){
            int index = ch-'a';
            if(temp.kavin[index] == null){
                return c;
            }
            sb.append(ch);
            temp = temp.kavin[index];
            if(temp.isEnd && word.endsWith(sb.toString())){
                c += temp.count;
            }
        }
        return c;
    }
}
class Solution {
    public long countPrefixSuffixPairs(String[] words) {
        Trie trie = new Trie();
        long count = 0;
        int n = words.length;
        for(int i=0;i<n;i++){
            count += trie.search(trie, words[i]);
            trie.insert(trie, words[i]);
        }
        return count;
    }
}