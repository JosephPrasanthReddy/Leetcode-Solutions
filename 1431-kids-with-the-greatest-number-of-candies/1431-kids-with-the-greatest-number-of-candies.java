class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int b=0;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>b)
            {
                b=candies[i];
            }
        }
        List<Boolean> c=new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=b)
            {
                c.add(true);
            }
            else
            {
                c.add(false);
            }
        }
        return c;
    }
}