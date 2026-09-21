class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        int b=0;
        for(int i=0;i<nums.length;i++)
        {
            if(b==groups.length)
            {
                return true;
            }
            if(groups[b].length+i>nums.length)
            {
                return false;
            }
            int c[]=Arrays.copyOfRange(nums,i,groups[b].length+i);
            if(Arrays.equals(c,groups[b]))
            {
                i+=c.length-1;
                b++;
            }
        }
        return b==groups.length;
    }
}