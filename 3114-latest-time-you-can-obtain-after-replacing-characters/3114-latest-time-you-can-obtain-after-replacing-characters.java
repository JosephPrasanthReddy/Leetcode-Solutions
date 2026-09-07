class Solution {
    public String findLatestTime(String s) {
        char[] a=s.toCharArray();
        if(a[0]=='?' && (a[1]<'2' ||a[1]=='?'))
        {
            a[0]='1';
        }
        else if(a[0]=='?' && a[1]>='2')
        {
            a[0]='0';
        }
        if(a[1]=='?' && a[0]=='0')
        {
            a[1]='9';
        }
        else if(a[1]=='?' && a[0]=='1')
        {
            a[1]='1';
        }
        if(a[3]=='?')
        {
            a[3]='5';
        }
        if(a[4]=='?')
        {
            a[4]='9';
        }
        return new String(a);
    }
}