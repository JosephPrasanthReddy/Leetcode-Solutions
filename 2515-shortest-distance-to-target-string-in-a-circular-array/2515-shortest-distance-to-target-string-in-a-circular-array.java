class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int op=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].equals(target))
            {
                if(Math.abs(i-startIndex)<op)
                {
                    op=Math.abs(i-startIndex);
                }
                if(Math.abs(Math.abs(i-startIndex)-words.length)<op)
                {
                    op=Math.abs(Math.abs(i-startIndex)-words.length);
                }
            }
        }
        if(op==Integer.MAX_VALUE)
        {
            return -1;
        }
        else
        {
            return op;
        }
    }
}