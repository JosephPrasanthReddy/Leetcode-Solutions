class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long x=0;
        for(int i:nums)
        {
            x+=i;
        }
        long diff=Math.abs((long)goal-x);
        return (int)((limit+diff-1)/limit);
    }
}