class Solution {
    public int countKthRoots(int l, int r, int k) {
        if(k==1)
        {
            return r-l+1;
        }
        int ans=0;
        if(l==0)
        {
            ans++;
        }
        int i=1;
        while(true)
        {
            double x=Math.pow(i,k);
            if(x>r)
            {
                break;
            }
            else if(x>=l && x<=r)
            {
                ans++;
            }
            i++;
        }
        return ans;
    }
}