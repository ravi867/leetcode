class Solution {
    public int findDuplicate(int[] arr) {
       int i=0;
       while(i<arr.length)
       {    int correct =arr[i]-1;
            if(arr[i]==i+1)
                i++;
            if(arr[correct]==arr[i])
                break;
            int temp= arr[i];
            arr[i]=arr[correct];
            arr[correct]=temp;
            
            
       }
       return arr[i];
    }
}