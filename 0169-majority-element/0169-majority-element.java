class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int a=nums.length/2;
        int b=nums[a];
        return b;
    }
}