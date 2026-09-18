class Solution {
    public int monkeyMove(int n) {
        long b=2;
        long a=1;
        while(n>0)
        {
            if(n%2==1)
            {
                a=(a*b)%1000000007;
            }
            b=(b*b)%1000000007;
            n/=2;
        }
        return ((int)(a-2+1000000007)%1000000007);
    }
}