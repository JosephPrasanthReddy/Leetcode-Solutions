class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> a=new ArrayList<>();
        for(String i:words)
        {
            for(String j:words)
            {
                if(!i.equals(j) && i.contains(j) && !a.contains(j))
                {
                    a.add(j);
                }
            }
        }
        return a;
    }
}