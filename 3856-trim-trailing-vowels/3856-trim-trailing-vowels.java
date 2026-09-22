class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder a=new StringBuilder(s);
        for(int i=s.length()-1;i>-1;i--)
        {
            if("aeiou".indexOf(a.charAt(i))!=-1)
            {
                a.deleteCharAt(i);
                continue;
            }
            break;
        }
        return new String(a);
    }
}