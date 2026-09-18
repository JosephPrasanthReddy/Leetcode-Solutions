class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] a=s.toCharArray();
        Arrays.sort(a);
        if(x<=y)
        {
            for(int i=0,j=a.length-1;i<j;i++,j--)
            {
                char t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        return new String(a);
    }
}