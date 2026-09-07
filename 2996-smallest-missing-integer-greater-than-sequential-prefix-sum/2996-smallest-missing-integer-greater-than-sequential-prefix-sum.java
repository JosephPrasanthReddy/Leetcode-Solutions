class Solution {
    public int missingInteger(int[] nums) {
        int s=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1]+1){
                break;
            }
            s+=nums[i];
        }
        Set<Integer> set=new HashSet<>();
        for(int n:nums)
        {
            set.add(n);
        }
        while(set.contains(s)){
            s++;
        }
        return s;
    }
}