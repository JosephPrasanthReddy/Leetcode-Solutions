class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int x=0;
        int y=0;
        for(int i=0;i<nums1.length+nums2.length;i++)
        {
            if(nums1[x]==nums2[y])
            {
                return nums1[x];
            }
            if(nums1[x]<nums2[y])
            {
                if(x<nums1.length-1){
                    x++;
                }
                else{
                    return -1;
                }
            }
            else
            {
                if(y<nums2.length-1)
                {
                    y++;
                }
                else{
                    return -1;
                }
            }
        }
        return -1;
    }
}