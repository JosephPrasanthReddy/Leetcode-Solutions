class Solution {
    public int twoEggDrop(int n) {
        int i=0;
        while(n>0)
        {
            i++;
            n-=i;
        }
        return i;
    }
}