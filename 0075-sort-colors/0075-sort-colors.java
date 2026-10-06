class Solution {
    public void sortColors(int[] nums) {
        int zs=0;
        int os=0;
        for(int i:nums)
        {
            if(i==0)
            {
                zs++;
            }
            else if(i==1)
            {
                os++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(zs>0)
            {
                nums[i]=0;
                zs--;
            }
            else if(os>0)
            {
                nums[i]=1;
                os--;
            }
            else
            {
                nums[i]=2;
            }
        }
    }
}