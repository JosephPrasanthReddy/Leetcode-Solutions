class Solution {
    public String minRemoveToMakeValid(String s) {
        int ob=0;
        int cb=0;
        StringBuilder a=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')' && ob<=cb)
            {
                continue;
            }
            if(s.charAt(i)==')')
            {
                cb++;
            }
            if(s.charAt(i)=='(')
            {
                ob++;
            }
            a.append(s.charAt(i));
        }
        int i=a.length()-1;
        while(a.length()>0 && ob!=cb)
        {
            if(a.charAt(i)=='(')
            {
                a.deleteCharAt(i);
                ob--;
            }
            i--;
        }
        return new String(a);
    }
}