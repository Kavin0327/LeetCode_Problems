class Trie{
    Trie []kavin = new Trie[26];
    boolean isEnd = false;
}

class Solution {
    Trie kd;
    public void insert(char word[]){
        Trie temp = kd;
        for(char c:word){
            int index = c-'a';
            if(temp.kavin[index] == null){
                temp.kavin[index] = new Trie();
            }
            temp = temp.kavin[index];
        }
        temp.isEnd = true;
    }

    public String search(char word[]){
        Trie temp = kd;
        StringBuilder result = new StringBuilder();
        for(char c:word){
            int index = c-'a';
            if(temp.isEnd)
                return result.toString();
            else if(temp.kavin[index] == null)
                return " ";
            result.append(c); // (char)(index+'a')
            temp = temp.kavin[index];
        }
        return result.toString();
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        kd = new Trie();
        StringBuilder answer = new StringBuilder();
        String input[]  = sentence.split(" ");
        int n = input.length;

        for(String word:dictionary){
            insert(word.toCharArray());
        }

        for(int i=0;i<n;i++){
            String match = search(input[i].toCharArray());
            // System.out.println(match);
            if(match.equals(" ")){
                answer.append(input[i]);
            }else{
                answer.append(match);
            }
            if(i != n-1)
                answer.append(" ");
        }
        return answer.toString();
    }
}