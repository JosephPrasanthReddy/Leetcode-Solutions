class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int k = 0;
        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i-1]==nums[i] && nums[i+1]==nums[i])
            {
                nums[i-1]=2147483647;
                k++;
            }
        }
        Arrays.sort(nums);
        return nums.length-k;   
    }
}