class Solution {
    public int findKthPositive(int[] arr, int k) {
        int x=0;
        for(int i=1;i<=arr[arr.length-1];i++)
        {
            if(i!=arr[x])
            {
                k--;
            }
            else{
                x++;
            }
            if(k==0)
            {
                return i;
            }
        }
        return k+arr[arr.length-1];
    }
}