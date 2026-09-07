class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        Set<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            mn=Math.min(mn,i);
            mx=Math.max(mx,i);
            set.add(i);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=mn+1;i<mx;i++)
        {
            if(!set.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}