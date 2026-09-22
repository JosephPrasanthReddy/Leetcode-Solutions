class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int x=0;
        int f=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0 || nums[i]!=nums[i-1])
            {
                f=1;
            }
            else
            {
                f++;
            }
            if(f<=k)
            {
                nums[x]=nums[i];
                x++;
            }
        }
        return Arrays.copyOf(nums,x);
    }
}