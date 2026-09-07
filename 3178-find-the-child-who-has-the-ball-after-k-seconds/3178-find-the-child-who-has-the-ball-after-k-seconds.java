class Solution {
    public int numberOfChild(int n, int k) {
        int a1=k%(2*(n-1));
        if(a1>n-1)
        {
            return 2*(n-1) - a1;
        }
        return a1;
    }
}