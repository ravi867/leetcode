class Solution {
    public int reverse(int x) {
         long rev=0;
         int n;
         if(x<0)
             n=-1*x;
        else
            n=x;
        while(n>0)
        {
        int r=n%10;
        rev=rev*10+r;
        n=n/10;
        }
        if(rev > Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int) rev*-1;
        }

        
             return (int)rev;
    }
}