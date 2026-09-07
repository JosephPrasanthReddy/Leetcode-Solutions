class Solution {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int a=0;
        for(int i:coins)
        {
            if(i>(a+1))
            {
                break;
            }
            a+=i;
        }
        return a+1;
    }
}