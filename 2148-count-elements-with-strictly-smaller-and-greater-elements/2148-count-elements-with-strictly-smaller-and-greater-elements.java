class Solution {
    public int countElements(int[] nums) {
        int small=Integer.MAX_VALUE;
        int big=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<small)
            {
                small=nums[i];
            }
            if(nums[i]>big)
            {
                big=nums[i];
            }
        }
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=small && nums[i]!=big)
            {
                a++;
            }
        }
        return a;
        
    }
}