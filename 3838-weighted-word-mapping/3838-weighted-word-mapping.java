class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder a=new StringBuilder();
        for (String i : words) 
        {
            int x=0;
            for(int j=0;j<i.length();j++)
            {
                x+=weights[i.charAt(j)-'a'];
            }
            x%=26;
            a.append((char)('a'+(25-x)));
        }
        return a.toString();
    }
}