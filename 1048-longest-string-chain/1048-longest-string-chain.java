class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b) -> a.length()-b.length());
        int x[]=new int[words.length];
        Arrays.fill(x,1);
        for(int i=1;i<words.length;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(words[i].length()-words[j].length()>1)
                {
                    break;
                }
                if(words[i].length()-words[j].length()==0)
                {
                    continue;
                }
                int b=0;
                int c=0;
                for(int k=0;k<words[i].length() && c<words[j].length();k++)
                {
                    if(words[i].charAt(k)!=words[j].charAt(c) && b==0)
                    {
                        b++;

                    }
                    else if(words[i].charAt(k)!=words[j].charAt(c) && b==1)
                    {
                        b++;
                        break;
                    }
                    else
                    {
                        c++;
                    }
                }
                if(c == words[j].length())
                {
                    x[i]=Math.max(x[j]+1,x[i]);
                }
            }
        }
        int a=0;
        for(int i:x)
        {
            a=Math.max(i,a);
        }
        return a;
    }
}