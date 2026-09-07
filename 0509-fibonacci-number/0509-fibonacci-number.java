class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int o=0;
        int t=1;
        for(int i=2;i<=n;i++)
        {
            int t3=o+t;
            o=t;
            t=t3;
        }
        return t;
    }
}