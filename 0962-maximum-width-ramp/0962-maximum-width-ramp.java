class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> x=new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            if(x.isEmpty() || nums[x.peek()]>nums[i])
            {
                x.push(i);
            }
        }
        int a=0;
        for(int i=nums.length-1;i>-1;i--)
        {
            while(!x.isEmpty() && nums[x.peek()]<=nums[i])
            {
                a=Math.max(a,i-x.pop());
            }
        }
        return a;
    }
}