class Solution {
    public boolean checkDivisibility(int n) {
        int n1=n;
        int s=0;
        int p=1;
        while(n1>0)
        {
            int a=n1%10;
            n1/=10;
            s+=a;
            p*=a;
        }
        return n%(s+p)==0;
    }
}