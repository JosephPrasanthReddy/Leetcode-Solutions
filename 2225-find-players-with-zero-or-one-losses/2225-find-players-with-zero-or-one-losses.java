class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int mp=0;
        for(int i=0;i<matches.length;i++)
        {
            mp=Math.max(mp,matches[i][0]);
            mp=Math.max(mp,matches[i][1]);
        }
        int x[]=new int[mp+1];
        Arrays.fill(x,-1);
        for(int i=0;i<matches.length;i++)
        {
            if(x[matches[i][1]]==-1)
            {
                x[matches[i][1]]++;
            }
            if(x[matches[i][0]]==-1)
            {
                x[matches[i][0]]++;
            }
            x[matches[i][1]]++;
        }
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        a.add(b);
        a.add(c);
        for(int i=1;i<x.length;i++)
        {
            if(x[i]==0)
            {
                b.add(i);
            }
            if(x[i]==1)
            {
                c.add(i);
            }
        }
        return a;
    }
}