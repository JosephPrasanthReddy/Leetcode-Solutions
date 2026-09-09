class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> a=new ArrayList<>();
        int l=0;
        for(int i=1;i<=n;i++)
        {
            if(target[l]==i)
            {
                a.add("Push");
                l++;
            }
            else
            {
                a.add("Push");
                a.add("Pop");
            }
            if(target[target.length-1]==i)
            {
                break;
            }
        }
        return a;
    }
}