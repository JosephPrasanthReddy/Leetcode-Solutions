class Solution {
    public boolean halvesAreAlike(String s) {
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()/2)
            {
                if("aeiouAEIOU".indexOf(s.charAt(i))!=-1)
                {
                    a++;
                }
            }
            else
            {
                if("aeiouAEIOU".indexOf(s.charAt(i))!=-1)
                {
                    a--;
                }  
            }
        }
        return a==0;
    }
}