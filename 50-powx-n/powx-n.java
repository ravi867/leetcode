class Solution {
    public double myPow(double x, int n) {
      double res = pow(x,abs(n));
      return (n>0)?res:1/res;   
    }
    private int abs(int n)
    {
        return (n>0)?n:-1*n;
    }
    private double pow(double x,int n)
    {
        if(n==0)
            return 1;
        double temp= pow(x,n/2);
        if(n%2==0)
            return temp*temp;
        else
            return temp*temp*x;
    }
    
}