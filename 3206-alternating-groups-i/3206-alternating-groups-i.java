class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int x[]=new int[colors.length+2];
        for(int i=0;i<colors.length;i++)
        {
            x[i]=colors[i];
        }
        x[colors.length]=colors[0];
        x[colors.length+1]=colors[1];
        int a=0;
        for(int i=1;i<x.length-1;i++)
        {
            if(x[i-1]==x[i+1] && x[i-1]!=x[i] && x[i+1]!=x[i])
            {
                a++;
            }
        }
        return a;
    }
}