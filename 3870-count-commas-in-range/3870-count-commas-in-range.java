class Solution {
    public int countCommas(int n) {
        if(n>999 && n<1000000)
        {
            return (n-1000) +1;
        }
        return 0;
    }
}