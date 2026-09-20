class Solution {
    public int maxSum(int[] nums) {
        int[] max = new int[10];
        Arrays.fill(max, -1);
        int ans = -1;
        for (int num : nums) {
            int x = num;
            int m = 0;
            while (x > 0) {
                m = Math.max(m, x % 10);
                x /= 10;
            }
            if (max[m] != -1) {
                ans = Math.max(ans, num + max[m]);
            }
            max[m] = Math.max(max[m], num);
        }
        return ans;
    }
}