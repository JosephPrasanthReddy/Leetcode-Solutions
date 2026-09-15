class Solution {
    public int addMinimum(String word) {
        int a=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)=='c')
            {
                a+=2;
            }
            if(word.charAt(i)=='b')
            {
                if(i==word.length()-1 || word.charAt(i+1)!='c')
                {
                    a+=2;
                }
                else
                {
                    a++;
                    i++;
                }
            }
            if(word.charAt(i)=='a')
            {
                if(i==word.length()-1)
                {
                    a+=2;
                }
                else if(word.charAt(i+1)=='c')
                {
                    a++;
                    i++;
                }
                else if(word.charAt(i+1)!='b')
                {
                    a+=2;
                }
                else if(i==word.length()-2 || word.charAt(i+2)!='c')
                {
                    a++;
                    i++;
                }
                else
                {
                    i+=2;
                }
            }

        }
        return a;
    }
}