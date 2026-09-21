class Solution {
    public int maximumSwap(int num) {
        char x[]=String.valueOf(num).toCharArray();
        int y[]=new int[10];
        for(int i=0;i<x.length;i++)
        {
            y[x[i]-'0']=i;
        }
        for(int i=0;i<x.length;i++)
        {
            for(int j=9;j>x[i]-'0';j--)
            {
                if(y[j]>i)
                {
                    char t=x[i];
                    x[i]=x[y[j]];
                    x[y[j]]=t;
                    return Integer.parseInt(new String(x));
                }
            }
        }
        return num;
    }
}