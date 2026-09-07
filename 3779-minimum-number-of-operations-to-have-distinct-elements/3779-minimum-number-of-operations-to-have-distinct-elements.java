class Solution {
    public int minOperations(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=nums.length-1;i>-1;i--)
        {
            if(!h.add(nums[i]))
            {
                return (i+3)/3;
            }
        }
        return 0;
    }
}