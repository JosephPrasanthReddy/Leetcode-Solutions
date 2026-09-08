class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++)
        {
            int nums=i;
            int r=i%10;
            nums/=10;
            while(nums>9)
            {
                int m=nums%10;
                int l=(nums%100)/10;
                if((m>r && m>l) || m<r && m<l)
                {
                    ans++;
                }
                r=m;
                m=l;
                nums/=10;
            }
        }
        return ans;
    }
}