class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int x[]=new int[24];
        int a=0;
        for(int i:hours)
        {
            int y=i%24;
            if(y==0)
            {
                a+=x[0];
            }
            else
            {
                a+=x[24-y];
            }
            x[y]++;
        }
        return a;
    }
}