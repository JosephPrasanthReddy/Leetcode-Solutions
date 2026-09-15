class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int l=arr.length*5/100;
        int s=0;
        for(int i=l;i<arr.length-l;i++)
        {
            s+=arr[i];
        }
        return (double)s/(arr.length-(l*2));
    }
}