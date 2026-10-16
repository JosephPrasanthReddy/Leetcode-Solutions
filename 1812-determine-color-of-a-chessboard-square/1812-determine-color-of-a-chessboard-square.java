class Solution {
    public boolean squareIsWhite(String coordinates) {
        int i=coordinates.charAt(1);
        if("aceg".indexOf(coordinates.charAt(0))!=-1)
        {
            if(i%2==0)
            {
                return true;
            }
            return false;
        }
        if(i%2==0)
        {
            return false;
        }
        return true;
    }
}