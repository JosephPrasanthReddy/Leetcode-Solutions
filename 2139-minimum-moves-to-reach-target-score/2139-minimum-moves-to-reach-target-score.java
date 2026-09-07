class Solution {
    public int minMoves(int target, int maxDoubles) {
        int i=0;
        while(target!=1)
        {
            if(target %2==1)
            {
                target--;
                i++;
            }
            else
            {
                if(maxDoubles>0)
                {
                    target/=2;
                    i++;
                    maxDoubles--;
                }
                else if(maxDoubles==0)
                {
                    return i+target-1;

                }
            }
        }
        return i;
    }
}