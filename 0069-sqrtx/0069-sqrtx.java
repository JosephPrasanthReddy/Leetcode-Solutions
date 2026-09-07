class Solution {
    public int mySqrt(int x) {
        int y=0;
        while((long)y*y<=x)
        {
            y++;
        }
        return y-1;
    }
}