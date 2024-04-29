class Solution {
    public int scoreOfString(String s) {
        int i,j;
        int sum=0;
        for( i=0,j=i+1;j<s.length();i++,j++)
        {
            int x= (int)(s.charAt(i));
            int y= (int)(s.charAt(j));
            sum=sum+Math.abs(x-y);
        }
        return sum;
        
    }
}