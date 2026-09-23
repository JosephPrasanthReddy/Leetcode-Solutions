class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int a=0;
        int b=0;
        int ca=0;
        int cb=0;
        for(int i:nums)
        {
            if(i==a)
            {
                ca++;
            }
            else if(i==b)
            {
                cb++;
            }
            else if(ca==0)
            {
                a=i;
                ca++;
            }
            else if(cb==0)
            {
                b=i;
                cb++;
            }
            else
            {
                ca--;
                cb--;
            }
        }
        ca=0;
        cb=0;
        for(int i:nums)
        {
            if(i==a)
            {
                ca++;
            }
            else if(i==b)
            {
                cb++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        if(ca>nums.length/3)
        {
            ans.add(a);
        }
        if(cb>nums.length/3)
        {
            ans.add(b);
        }
        return ans;
    }
}