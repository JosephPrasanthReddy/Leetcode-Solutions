class Solution {
    public int movesToMakeZigzag(int[] nums) {
        int e=0;
        int o=0;
        for(int i=0;i<nums.length;i++)
        {
            int l=(i>0)?nums[i-1]:Integer.MAX_VALUE;
            int r=(i<nums.length-1)?nums[i+1]:Integer.MAX_VALUE;
            int d=Math.max(0,nums[i]-Math.min(l,r)+1);
            if(i%2==0){
                e+=d;
            }
            else{
                o+=d;
            }
        }
        return Math.min(e,o);
        
    }
}