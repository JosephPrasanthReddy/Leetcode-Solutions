class Solution {
    public long countVowels(String word) {
        long a=0;
        for(int i=0;i<word.length();i++)
        {
            if("aeiou".indexOf(word.charAt(i))!=-1)
            {
                a+=(long)(i+1)*(word.length()-i);
            }
        }
        return a;
    }
}