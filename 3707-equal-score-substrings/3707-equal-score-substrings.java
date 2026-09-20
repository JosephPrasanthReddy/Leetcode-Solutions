class Solution {
    public boolean scoreBalance(String s) {
        int i=0;
        int j=s.length()-1;
        int x=s.charAt(i)-'a'+1;
        int y=s.charAt(j)-'a'+1;
        while(i+1<j)
        {
            if(x<y)
            {
                i++;
                x+=s.charAt(i)-'a'+1;
            }
            else
            {
                j--;
                y+=s.charAt(j)-'a'+1;
            }
        }
        return  x==y;
    }
}