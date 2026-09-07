class Solution {
    public int reverse(int x) {
        int n=x;
        if(x==0)
        {
            return 0;
        }
        double r=0;
        while(n>0)
        {
            int temp=0;
            temp+=n%10;
            r=r*10+temp;
            n/=10;
        }
        while(n<0)
        {
            int temp=0;
            temp-=n%10;
            r=r*10-temp;
            n/=10;
        }
        if(r<-2147483648 || r>2147483647)
        {
            return 0;
        }
        int r2=(int)r;
        return r2;
    }
}