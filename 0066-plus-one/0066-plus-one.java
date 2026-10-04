class Solution {
    public int[] plusOne(int[] digits) {
        boolean a=true;
        for(int i:digits)
        {
            if(i!=9)
            {
                a=false;
                break;
            }
        }
        if(a==true)
        {
            int ans[]=new int[digits.length+1];
            ans[0]=1;
            return ans;
        }
        for(int i=digits.length-1;i>-1;i--)
        {
            if(digits[i]!=9)
            {
                digits[i]++;
                break;
            }
            else
            {
                digits[i]=0;
            }
        }
        return digits;
    }
}