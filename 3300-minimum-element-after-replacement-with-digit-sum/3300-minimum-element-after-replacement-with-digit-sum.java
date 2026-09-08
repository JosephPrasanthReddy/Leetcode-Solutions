class Solution {
    public int minElement(int[] nums) {
        int ans=1000000;
        for(int i:nums)
        {
            int x=0;
            while(i>0)
            {
                x+=i%10;
                i/=10;
            }
            ans=Math.min(ans,x);
        }
        return ans;
    }
}