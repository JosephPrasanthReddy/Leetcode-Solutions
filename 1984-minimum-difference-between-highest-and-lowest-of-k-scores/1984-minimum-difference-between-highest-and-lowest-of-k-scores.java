class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int a=1000000;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+k-1;j<nums.length;j++)
            {
                a=Math.min(nums[j]-nums[i],a);
            }
        }
        return a;
    }
}