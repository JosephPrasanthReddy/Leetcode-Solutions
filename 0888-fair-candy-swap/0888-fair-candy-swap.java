class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a=0;
        int b=0;
        for(int i:aliceSizes)
        {
            a+=i;
        }
        for(int i:bobSizes)
        {
            b+=i;
        }
        int x=Math.abs(a-b)/2;
        for(int i:aliceSizes)
        {
            for(int j:bobSizes)
            {
                if((a>b && i-j==x) || (a<b && j-i==x))
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}