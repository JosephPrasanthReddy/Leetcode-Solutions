class Solution {
    public long sumOfLargestPrimes(String s) {
        HashSet<Long> hm=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            long num=0;
            for(int j=i;j<s.length();j++)
            {
                num=num*10+(s.charAt(j)-'0');
                if(num<2)
                {
                    continue;
                }
                boolean prime=true;
                for(long n=2;n*n<=num;n++)
                {
                    if(num%n==0)
                    {
                        prime=false;
                    }
                }
                if(prime)
                {
                    hm.add(num);
                }
            }
        }
        ArrayList<Long> a=new ArrayList<>(hm);
        Collections.sort(a,Collections.reverseOrder());
        long ans=0;
        for(int i=0;i<Math.min(a.size(),3);i++)
        {
            ans+=a.get(i);
        }
        return ans;
    }
}