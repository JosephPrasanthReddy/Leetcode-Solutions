class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int a[]=new int[seq.length()];
        int d=0;
        for(int i=0;i<seq.length();i++)
        {
            if(seq.charAt(i)=='(')
            {
                d++;
                a[i]=d%2;
            }
            else
            {
                a[i]=d%2;
                d--;
            }
        }
        return a;
    }
}