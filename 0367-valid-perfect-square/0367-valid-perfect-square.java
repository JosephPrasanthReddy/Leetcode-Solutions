class Solution {
    public boolean isPerfectSquare(int num) {
        int x=0;
        while(x<num)
        {
            x++;
            if((long)x*x==num)
            {
                return true;
            }
            if((long)x*x>num)
            {
                return false;
            }
        }
        return false;
    }
}