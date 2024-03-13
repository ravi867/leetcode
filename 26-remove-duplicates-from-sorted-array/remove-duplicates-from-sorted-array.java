class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        int cnt=1;
        int i=0;
        int j=i+1;
        while(j<n)
        {
            if(nums[j]>nums[i])
            {
                nums[i+1]=nums[j];
                cnt++;
                i++;
            }
            j++;
        }
        return cnt;
        
    }
}