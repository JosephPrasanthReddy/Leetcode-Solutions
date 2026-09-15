class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            int c=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]==target)
                {
                    c++;
                }
                if(c*2>j-i+1)
                {
                    a++;
                }
            }
        }
        return a;
        
    }
}