class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                char p=grid[i][j];
                char q= grid[i+1][j];
                char r= grid[i][j+1];
                char s= grid[i+1][j+1];
                int charBlack=0;
                int charWhite=0;
                if(p=='B')
                    charBlack++;
                else
                    charWhite++;
                if(q=='B')
                    charBlack++;
                else
                    charWhite++;
                if(r=='B')
                    charBlack++;
                else
                    charWhite++;
                if(s=='B')
                    charBlack++;
                else
                    charWhite++;
                if(charBlack>=3 || charWhite>=3)
                    return true;
                
            }
            
        }
        return false;
        
    }
}