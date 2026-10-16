class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        long[] x=new long[tasks.length];
        int[] a=new int[shifts.length];
        for(int i=0;i<tasks.length;i++)
        {
            if(i==0)
            {
                x[0]=tasks[0];
                continue;
            }
            x[i]=x[i-1]+tasks[i];
        }
        long c=0;
        for(int i=0;i<a.length;i++)
        {
            c+=shifts[i];
            if(c>=x[tasks.length-1])
            {
                a[i]=0;
                c=0;
                continue;
            }
            int l=0;
            int r=x.length;
            while(l<r)
            {
                int m=(l+r)/2;
                if(x[m]>c)
                {
                    r=m;
                }
                else
                {
                    l=m+1;
                }
            }
            a[i]=tasks.length-l;
        }
        return a;
    }
}