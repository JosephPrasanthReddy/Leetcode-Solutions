class Solution {
    public int[] assignElements(int[] groups, int[] elements) {
        int me=0;
        for(int i:groups)
        {
            me=Math.max(me,i);
        }
        int a[]=new int[me+1];
        int rv[]=new int[me+1];
        Arrays.fill(rv,-1);
        Arrays.fill(a,-1);
        for(int i=0;i<elements.length;i++)
        {
            int x=elements[i];
            if (x > me) 
            {
                continue;
            }
            if(rv[x]!=-1)
            {
                continue;
            }
            rv[x]=1;
            for(int j=x;j<=me;j+=x)
            {
                if(a[j]==-1)
                {
                    a[j]=i;
                }
            }
        }
        int[] ans=new int[groups.length];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=a[groups[i]];
        }
        return ans;
    }
}