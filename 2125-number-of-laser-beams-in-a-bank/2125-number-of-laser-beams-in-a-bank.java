class Solution {
    public int numberOfBeams(String[] bank) {
        int a=0;
        int l=0;
        int r=0;
        for(int i=0;i<bank[0].length();i++)
        {
            if(bank[0].charAt(i)=='1')
            {
                l++;
            }
        }
        for(int i=1;i<bank.length;i++)
        {
            r=0;
            for(int j=0;j<bank[i].length();j++)
            {
                if(bank[i].charAt(j)=='1')
                {
                    r++;
                }
            }
            if(r!=0){
                a+=l*r;
                l=r;
            }
        }
        return a;    
    }
}