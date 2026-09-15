class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int s=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            int rem=s%k;
            if(hm.containsKey(rem))
            {
                if(i-hm.get(rem)>1)
                {
                    return true;
                }
            }
            else
            {
                hm.put(rem,i);
            }
        }
        return false;
    }
}