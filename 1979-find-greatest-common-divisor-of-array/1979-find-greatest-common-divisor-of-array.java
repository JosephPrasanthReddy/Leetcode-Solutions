class Solution {
    public int findGCD(int[] nums) {
        int sn=nums[0];
        int ln=nums[0];
        for(int i:nums)
        {
            sn=Math.min(sn,i);
            ln=Math.max(ln,i);
        }
        for(int i=ln;i>=1;i--)
        {
            if(sn%i==0 && ln%i==0)
            {
                return i;
            }
        }
        return 1;
    }
}