class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s=new StringBuilder();
        int i=0;
        int j=0;
        int t=0;
        while(word1.length()>i || word2.length()>j)
        {
            if(word1.length()>i)
            {
                char x=word1.charAt(i);
                s.append(x);
                i++;
            }
            if(word2.length()>j)
            {
                char y=word2.charAt(j);
                s.append(y);
                j++;
            }
        }
        return s.toString();
    }
}