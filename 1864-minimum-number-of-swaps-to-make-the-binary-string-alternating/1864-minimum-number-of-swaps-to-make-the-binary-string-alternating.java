class Solution {
    public int minSwaps(String s) {
        int a1o=0;
        int a1e=0;
        int a2o=0;
        int a2e=0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                if(s.charAt(i)=='0')
                {
                    a2o++;
                }
                else
                {
                    a1o++;
                }
            }
            else
            {
                if(s.charAt(i)=='0')
                {
                    a1e++;
                }
                else
                {
                    a2e++;
                }
            }
        }
        if(a1e==a1o && a2e==a2o)
        {
            return Math.min(a1e,a2e);
        }
        else if(a1e==a1o)
        {
            return a1e;
        }
        else if(a2e==a2o)
        {
            return a2e;
        }
        return -1;
    }
}