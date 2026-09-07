class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int or=mat.length;
        int oc=mat[0].length;
        if(or*oc!=r*c)
        {
            return mat;
        }
        int[][] ans=new int[r][c];
        for(int i=0;i<or;i++)
        {
            for(int j=0;j<oc;j++)
            {
                int index=i*oc+j;
                int nr=index/c;
                int nc=index%c;
                ans[nr][nc]=mat[i][j];
            }

        }
        return ans;
    }
}