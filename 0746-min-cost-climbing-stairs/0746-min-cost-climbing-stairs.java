class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int o=cost[0];
        int t=cost[1];
        int c;
        for(int i=2;i<cost.length;i++)
        {
            c=cost[i]+Math.min(o,t);
            o=t;
            t=c;
        }
        return Math.min(o,t);
    }
}