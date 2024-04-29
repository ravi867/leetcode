class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        
        while(i<nums.length && nums[i]!=0)
        {
            i++;
        }
        if(i==nums.length)
            return;
        int j=i+1;
        while(j<nums.length)
        {
            if(nums[j]==0)
            {
                j++;
            }
            else
            {
                swap(nums,i,j);
                i++;
                j++;
            }


        }
       

    }
    static void swap(int [] nums,int a,int b)
    {
        int temp= nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}