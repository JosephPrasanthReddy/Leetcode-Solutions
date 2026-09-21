class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int c=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            c=Math.max(nums[i],c+nums[i]);
            max=Math.max(max,c);
        }
        c=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            c=Math.min(nums[i],c+nums[i]);
            min=Math.min(min,c);
        }
        return Math.max(max,Math.abs(min));
    }
}