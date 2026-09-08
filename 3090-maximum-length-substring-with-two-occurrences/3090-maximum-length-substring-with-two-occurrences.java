class Solution {
    public int maximumLengthSubstring(String s) {
        int a=0;
        int x[]=new int[26];
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            x[s.charAt(i)-'a']++;
            while(x[s.charAt(i)-'a']>2)
            {
                x[s.charAt(j)-'a']--;
                j++;
            }
            a=Math.max(i-j,a);
        }
        return a+1;
    }
}