class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int a=0;
        for(int i:batteryPercentages)
        {
            if(i>a)
            {
                a++;
            }
        }
        return a;
    }
}