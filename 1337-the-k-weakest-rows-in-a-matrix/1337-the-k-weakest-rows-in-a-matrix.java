class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int a[]=new int[k];
        int x[]=new int[mat.length];
        for(int i=0;i<mat.length;i++)
        {
            int b=0;
            for(int j=0;j<mat[i].length;j++)
            {
                b+=mat[i][j];
            }
            x[i]=b;
        }
        for(int i=0;i<k;i++)
        {
            int b=101;
            int c=-1;
            for(int j=0;j<mat.length;j++)
            {
                if(x[j]<b)
                {
                    b=x[j];
                    c=j;
                }
            }
            a[i]=c;
            x[c]=101;
        }
        return a;
    }
}