class Solution {
    public int maxRepeating(String sequence, String word) {
        int x=sequence.length()/word.length();
        for(int i=x;i>0;i--)
        {
            String s=word.repeat(i);
            if(sequence.contains(s))
            {
                return i;
            }
        }
        return 0;
    }
}