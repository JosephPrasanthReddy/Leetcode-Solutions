class Solution {
    public String tictactoe(int[][] moves) {
        int x[]=new int[10];
        for(int i=0;i<moves.length;i++)
        {
            if(i%2==0)
            {
                x[moves[i][0]*3+1+moves[i][1]]++;
            }
            else
            {
                x[moves[i][0]*3+1+moves[i][1]]+=2;
            }
            if((x[1]==x[2] && x[2]==x[3] && x[1]>0) || (x[4]>0 && x[4]==x[5] && x[5]==x[6]) || (x[7]>0 && x[7]==x[8] && x[8]==x[9]) || (x[1]>0 && x[1]==x[4] && x[4]==x[7]) || (x[2]>0 && x[2]==x[5] && x[5]==x[8]) || (x[3]>0 && x[3]==x[6] && x[6]==x[9]) || (x[1]>0 && x[1]==x[5] && x[5]==x[9]) || (x[3]>0 && x[3]==x[5] && x[5]==x[7]))
            {
                if(i%2==0 )
                {
                    return "A";
                }
                else
                {
                    return "B";
                }
            }
        }
        if(moves.length==9)
        {
            return "Draw";
        }
        return "Pending";
    }
}