class Solution {
    public int trap(int[] height) {
        int a=0;
        int h=0;
        for(int i=1;i<height.length;i++)
        {
            if(height[h]<=height[i])
            {
                h=i;
            }
        }
        int x=height[0];
        for(int i=1;i<h;i++)
        {
           if(height[i]>x)
           {
                x=height[i];
           }
           else
           {
                a+=x-height[i];
           }
        }
        x=height[height.length-1];
        for(int i=height.length-2;i>h;i--)
        {
            if(height[i]>x)
            {
                x=height[i];
            }
            else
            {
                a+=x-height[i];
            }
        }
        return a;
    }
}