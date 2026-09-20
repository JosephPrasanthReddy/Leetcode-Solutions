class Solution {
    public int beautifulSubstrings(String s, int k) {
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            int v=0;
            int c=0;
            for(int j=i;j<s.length();j++)
            {
                if("aeiou".indexOf(s.charAt(j))==-1)
                {
                    c++;
                }
                else
                {
                    v++;
                }
                if(v==c && (v*c)%k==0)
                {
                    a++;
                }
            }
        }
        return a;
    }
}