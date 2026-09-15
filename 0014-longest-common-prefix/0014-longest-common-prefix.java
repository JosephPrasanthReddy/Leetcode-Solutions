class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0;
        String a="";
        while(i<strs[0].length() && i<strs[strs.length-1].length())
        {
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
            {
                i++;
                a=strs[0].substring(0,i);
            }
            else
            {
                break;
            }
        }
        return a;
    }
}