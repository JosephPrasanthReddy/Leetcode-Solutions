class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int a=0;
        int max=nums[0];
        for(int i:nums)
        {
            max=Math.max(max,i);
            if(i>0 && hs.add(i))
            {
                a+=i;
            }
        }
        return a>0?a:max;
    }
}