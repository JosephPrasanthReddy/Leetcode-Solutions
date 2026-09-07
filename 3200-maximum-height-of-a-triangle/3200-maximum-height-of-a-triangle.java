class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int red1=red;
        int blue1=blue;
        int r=1;
        int b=1;
        while(true)
        {
            if(r%2==0)
            {
                if(red>=r){
                    red-=r;
                    r++;
                }
                else{break;}
            }
            else
            {
                if(blue>=r){
                    blue-=r;
                    r++;
                }
                else{break;}
            }
        }
        while(true)
        {
            if(b%2!=0)
            {
                if(red1>=b){
                    red1-=b;
                    b++;
                }
                else{break;}
            }
            else
            {
                if(blue1>=b){
                    blue1-=b;
                    b++;
                }
                else{break;}
            }
        }
        return Math.max(b,r)-1;
    }
}