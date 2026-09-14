class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> a=new HashMap<>();
        for(List<String> l:responses)
        {
            HashSet<String> s=new HashSet<>(l);
            for(String s1:s)
            {
                a.put(s1,a.getOrDefault(s1,0)+1);
            }
        }
        String ans="";
        for(String s:a.keySet())
        {
            if(ans.equals("") || a.get(s)>a.get(ans) || a.get(ans).equals(a.get(s)) && s.compareTo(ans)<0)
            {
                ans=s;
            }
        }
        return ans;
    }
}