class Solution {
    public int maximumEnergy(int[] energy, int k) {
        for(int i=energy.length-1;i>=k;i--)
        {
            energy[i-k]+=energy[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i:energy)
        {
            if(i>max)
            {
                max=i;
            }
        }
        return max;
    }
}