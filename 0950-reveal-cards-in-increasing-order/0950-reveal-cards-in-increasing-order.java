class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length; 
        Queue<Integer> queue = new LinkedList<>();
        for(int i = n-1;i>=0;i--){
            if(!queue.isEmpty()){
                queue.offer(queue.poll());
            }
            queue.offer(deck[i]);
        }
        for(int i=n-1;i>=0;i--)
            deck[i] = queue.poll();
        return deck;
    }
}