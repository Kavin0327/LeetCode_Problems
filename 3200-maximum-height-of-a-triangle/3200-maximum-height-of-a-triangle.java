class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int h1 = 0;
        int h2 = 0;
        int rCount = red;
        int bCount = blue;
        int level  = 1;
        while(true){ // red is first
            if(level%2 == 0){
                if(bCount < level)
                    break;
                bCount -= level;
            }
            else{
                if(rCount < level)
                    break;
                rCount -= level;
            }
            level++;
            h1++;
        }
        level = 1;
        rCount = red;
        bCount = blue;
        while(true){ // blue is first
            if(level%2 != 0){
                if(bCount < level)
                    break;
                bCount -= level;
            }
            else{
                if(rCount < level)
                    break;
                rCount -= level;
            }
            level++;
            h2++;
        }
        return (h1>h2)?h1:h2;
    }
}