class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int a[]=new int[nums.length-k+1];
        Arrays.fill(a,-1);
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            if(s.isEmpty() || (nums[i]==s.peek()+1 && s.size()<k))
            {
                s.add(nums[i]);
            }
            else if(nums[i]==s.peek()+1)
            {
                s.add(nums[i]);
            }
            else
            {
                s.clear();
                s.add(nums[i]);
            }
            if(s.size()>=k)
            {
                a[i-k+1]=nums[i];
            }
        }
        return a;
    }
}