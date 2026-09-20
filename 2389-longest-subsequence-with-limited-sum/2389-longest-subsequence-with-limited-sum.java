class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int a[]=new int[queries.length];
        int x[]=new int[nums.length];
        int b=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            b+=nums[i];
            x[i]=b;
        }
        for(int i=0;i<a.length;i++)
        {
            b=0;
            int c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(b+nums[j]>queries[i])
                {
                    break;
                }
                b+=nums[j];
                c++;
            }
            a[i]=c;
        }
        return a;
    }
}