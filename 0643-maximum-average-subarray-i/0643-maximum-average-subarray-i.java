class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int a=0;
        int ans=0;
        for(int i=0;i<k;i++)
        {
            a+=nums[i];
        }
        ans=a;
        for(int i=0;i<nums.length-k;i++)
        {
            a-=nums[i];
            a+=nums[i+k];
            ans=Math.max(a,ans);
        }
        return (double)ans/k;
    }
}