class Solution {
    public int minDeletion(int[] nums) {
        Stack<Integer> a=new Stack<>();
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(a.size()%2!=0 && a.peek()==nums[i])
            {
                ans++;
            }
            else{
                a.push(nums[i]);
            }
        }
        if(a.size()%2!=0)
        {
            a.push(nums[nums.length-1]);
            ans++;
        }
        return ans;
    }
}