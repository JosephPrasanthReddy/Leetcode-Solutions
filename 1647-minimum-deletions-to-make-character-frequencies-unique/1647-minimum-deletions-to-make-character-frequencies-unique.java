class Solution {
    public int minDeletions(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        HashSet <Integer> x=new HashSet<>();
        int a=0;
        for(int i:freq)
        {
            while(i>0 &&x.contains(i))
            {
                i--;
                a++;
            }
            x.add(i);
        }
        return a;
    }
}