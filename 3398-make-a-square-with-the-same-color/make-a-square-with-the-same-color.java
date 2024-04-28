class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                int charBlack=0;
                int charWhite=0;
                if(grid[i][j]=='B')
                    charBlack++;
                else
                    charWhite++;
                if(grid[i+1][j]=='B')
                    charBlack++;
                else
                    charWhite++;
                if(grid[i][j+1]=='B')
                    charBlack++;
                else
                    charWhite++;
                if(grid[i+1][j+1]=='B')
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