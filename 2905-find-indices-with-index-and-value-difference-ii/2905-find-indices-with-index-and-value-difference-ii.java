class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int mini = 0;
        int maxi = 0;

        for (int i = indexDifference; i < nums.length; i++) {
            int j = i - indexDifference;
            if (nums[j] <= nums[mini]) {
                mini = j;
            }
            if (nums[j] >= nums[maxi]) {
                maxi = j;
            }
            if (nums[i] - nums[mini] >= valueDifference) {
                return new int[]{mini, i};
            }
            if (nums[maxi] - nums[i] >= valueDifference) {
                return new int[]{maxi, i};
            }
        }
        return new int[]{-1, -1};
    }
}