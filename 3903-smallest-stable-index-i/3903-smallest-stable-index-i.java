class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max[]=new int[nums.length];
        int min[]=new int[nums.length];
        int maxe=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            max[i]=Math.max(maxe,nums[i]);
            maxe=Math.max(maxe,nums[i]);
        }
        int mine=nums[nums.length-1];
        for(int i=nums.length-1;i>-1;i--)
        {
            min[i]=Math.min(mine,nums[i]);
            mine=Math.min(mine,nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(max[i]-min[i]<=k)
            {
                return i;
            }
        }
        return -1;
    }
}