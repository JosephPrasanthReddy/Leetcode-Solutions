class Solution {
    public int maxProductDifference(int[] nums) {
        int m1=0;
        int m2=0;
        int min1=100000;
        int min2=100000;
        for(int i:nums)
        {
            if(i>m1)
            {
                m2=m1;
                m1=i;
            }
            else if(i>m2)
            {
                m2=i;
            }
            if(i<min1)
            {
                min2=min1;
                min1=i;
            }
            else if(i<min2)
            {
                min2=i;
            }
        }
        return (m1*m2)-(min1*min2);
    }
}