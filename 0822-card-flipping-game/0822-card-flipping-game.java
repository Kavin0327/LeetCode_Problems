class Solution {
    public int flipgame(int[] fronts, int[] backs){
        int n = fronts.length;
        Set<Integer> set = new HashSet<>();
        int minPossible = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(fronts[i] == backs[i])
                set.add(backs[i]);
        }
        for(int i=0;i<n;i++){
            if(!set.contains(fronts[i])){
                if(minPossible > fronts[i])
                    minPossible = fronts[i];
            }
            if(!set.contains(backs[i])){
                if(minPossible > backs[i])
                    minPossible = backs[i];
            }
        }
        
        if(minPossible == Integer.MAX_VALUE)
            return 0;
        return minPossible;
    }
}