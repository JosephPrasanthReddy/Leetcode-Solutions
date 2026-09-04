class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int maxi=-1;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>arr[i+1])
            {
                maxi=i+1;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[maxi]<arr[j] && arr[i]>arr[j])
                    {
                        maxi=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[maxi];
                arr[maxi]=temp;
                return arr;
            }
        }
        return arr;
    }
}