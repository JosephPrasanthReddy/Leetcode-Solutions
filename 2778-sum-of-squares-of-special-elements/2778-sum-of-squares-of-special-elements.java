class Solution {
    public int sumOfSquares(int[] nums) {
        int l=nums.length;
        int s=0;
        for(int i=0;i<l;i++)
        {
            if(l%(i+1)==0)
            {
                s+=nums[i]*nums[i];
            }
        }
        return s;
        
    }
}