class Solution {
    public long minimumPerimeter(long neededApples) {
        long n=0;
        long apples=0;
        while(neededApples>apples)
        {
            n++;
            apples+=12*n*n;
        }
        return n*8;
    }
}