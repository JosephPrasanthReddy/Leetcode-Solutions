class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int a=0;
        int ons=0;
        int zeros=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zeros++;
            }
            if(nums[i]==1)
            {
                ons++;
            }
            while(zeros>k)
            {
                if(nums[l]==0)
                {
                    zeros--;
                }
                l++;
            }
            if(i-l>a)
            {
                a=i-l;
            }
        }
        if(k==0 && ons==0)
        {
            return 0;
        }
        return a+1;
    }
}