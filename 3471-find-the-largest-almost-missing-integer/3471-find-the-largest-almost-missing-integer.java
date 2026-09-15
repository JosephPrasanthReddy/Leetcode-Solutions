class Solution {
    public int largestInteger(int[] nums, int k) {
        int x[] = new int[51];
        for(int i = 0; i <= nums.length - k; i++) {
            boolean used[] = new boolean[51];
            for(int j = i; j < i + k; j++) {
                if(!used[nums[j]]) {
                    x[nums[j]]++;
                    used[nums[j]] = true;
                }
            }
        }
        for(int i = 50; i >= 0; i--) {
            if(x[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}