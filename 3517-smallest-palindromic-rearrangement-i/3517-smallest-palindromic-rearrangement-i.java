class Solution {
    public String smallestPalindrome(String s) {
        int x[]=new int[26];
        int m=-1;
        for(int i=0;i<s.length();i++)
        {
            x[s.charAt(i)-'a']++;
        }
        StringBuilder a=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            if(x[i]%2==1)
            {
                m=i;
            }
            int j=x[i]/2;
            while(j>0)
            {
                a.append((char)(i+'a'));
                j--;
            }
        }
        String r=new StringBuilder(a).reverse().toString();
        return a.toString()+(m==-1 ? "":(char)(m+'a'))+r;
    }
}