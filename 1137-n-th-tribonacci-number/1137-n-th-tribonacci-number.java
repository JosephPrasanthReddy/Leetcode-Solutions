class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int o=0;
        int t=1;
        int t3=1;
        for(int i=2;i<n;i++)
        {
            int a=o+t+t3;
            o=t;
            t=t3;
            t3=a;
        }
        return t3;
    }
}