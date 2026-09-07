class Solution {
    public int findMin(int[] nums) {
        if(nums.length<2)
        {
            return nums[0];
        }
        int i=0;
        int j=nums.length-1;
        int min=5001;
        while(i<j)
        {
            if(nums[j]<min || nums[i]<min)
            {
                min=Math.min(nums[i],nums[j]);
            }
            if(nums[(i+j)/2]>nums[i])
            {
                i=(i+j)/2;
            }
            else
            {
                j=(i+j)/2;
            }
        }
        return min;
    }
}