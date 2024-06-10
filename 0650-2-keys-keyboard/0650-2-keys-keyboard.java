class Solution {
    public int kavinTrack(Integer memo[][],int totalNoOfA,int noOfA,int n,int op){
        if(totalNoOfA == n)
            return 0;
        else if(totalNoOfA > n || noOfA > n/2)
            return 1001;
        else if(memo[totalNoOfA][noOfA] != null)
            return memo[totalNoOfA][noOfA];
        else{
            int copy = 1001;
            int paste = 1001;
            if(op == 0){
                copy = 1+kavinTrack(memo,totalNoOfA,totalNoOfA,n,1);
            }
            if(noOfA != 0){
                paste = 1+kavinTrack(memo,totalNoOfA+noOfA,noOfA,n,0);
            }
            return memo[totalNoOfA][noOfA] = Math.min(copy,paste);   
        }
    }
    public int minSteps(int n) {
        Integer memo[][] = new Integer[n][(n/2)+1];
        return kavinTrack(memo,1,0,n,0);
    }
}