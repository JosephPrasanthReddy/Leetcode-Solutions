class Solution {
    public boolean judgeSquareSum(int c) {
        int a=0;
        int b=(int)Math.sqrt(c);
        if(c<3)
        {
            return true;
        }
        while(a<=b)
        {
            if((long)a*a+b*b==c)
            {
                return true;
            }
            else if((long)a*a+b*b>c)
            {
                b--;
            }
            else
            {
                a++;
            }
        }
        return false;
    }
}