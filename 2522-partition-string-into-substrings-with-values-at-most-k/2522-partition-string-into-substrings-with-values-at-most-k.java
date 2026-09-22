class Solution {
    public int minimumPartition(String s, int k) {
        long x=0;
        int a=1;
        for(int i=0;i<s.length();i++)
        {
            int y=s.charAt(i)-'0';
            x=x*10+y;
            if(x>k)
            {
                a++;
                x=y;
                if(x>k)
                {
                    return -1;
                }
            }
        }
        return a;
    }
}