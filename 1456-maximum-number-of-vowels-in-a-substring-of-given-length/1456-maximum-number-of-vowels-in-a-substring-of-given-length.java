class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            if(i<k)
            {
                if("aeiou".indexOf(s.charAt(i))!=-1)
                {
                    c++;
                }
            }
            else 
            {
                if("aeiou".indexOf(s.charAt(i-k))!=-1)
                {
                    c--;
                }
                if("aeiou".indexOf(s.charAt(i))!=-1)
                {
                    c++;
                }
            }
            a=Math.max(c,a);
        }
        return a;
    }
}