class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        if(nums[j]<target)
        {
            return j+1;
        }
        while(i<j)
        {
            if(nums[(i+j)/2]==target)
            {
                return (i+j)/2;
            }
            else if(nums[(i+j)/2]>target)
            {
                j=(i+j)/2;
            }
            else
            {
                i=(i+j)/2+1;
            }
        }
        return j;
    }
}