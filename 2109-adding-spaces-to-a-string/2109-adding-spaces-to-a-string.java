class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder a=new StringBuilder(s);
        int x=0;
        for(int i:spaces)
        {
            a.insert(i+x," ");
            x++;
        }
        return new String(a);
    }
}