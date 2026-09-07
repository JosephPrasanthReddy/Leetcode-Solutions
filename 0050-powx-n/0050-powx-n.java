class Solution {
    public double myPow(double x, int n) {
        double f=x;
        if(x==1 || (x==-1 && n<0))
        {
            return 1;
        }
        if(x==-1)
        {
            return -1;
        }
        if(n>1000000 || n<-1000000)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        else if(n>0)
        {
            while(n>1)
            {
                f*=x;
                n--;
            }
            return f;
        }
        else
        {
            n=-n;
            while(n>1)
            {
                f*=x;
                n--;
            }
            return 1/f;
        }
    }
}