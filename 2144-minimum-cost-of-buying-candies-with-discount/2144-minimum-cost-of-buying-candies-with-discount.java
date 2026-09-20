class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int x=0;
        int a=0;
        for(int i=cost.length-1;i>-1;i--)
        {
            if(x!=2)
            {
                a+=cost[i];
                x++;
            }
            else
            {
                x=0;
            }
        }
        return a;
    }
}