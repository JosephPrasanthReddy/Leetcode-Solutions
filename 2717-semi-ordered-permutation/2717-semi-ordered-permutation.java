class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int one=-1;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                one=i;
            }
            if(nums[i]>nums[max])
            {
                max=i;
            }
        }
        int ans=one;
        if(one>max)
        {
            return ans+nums.length-max-2;
        }
        return ans+nums.length-max-1;
    }
}