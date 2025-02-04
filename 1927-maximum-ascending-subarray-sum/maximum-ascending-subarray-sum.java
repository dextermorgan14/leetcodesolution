class Solution {
    public int maxAscendingSum(int[] nums) {
     int n=nums.length;
     int sum=0;
     int result=0;
     for(int i=0;i<n;i++)
     {
        sum=nums[i];
        int j=i+1;

        while(j<n && nums[j]>nums[j-1])
        {
            sum+=nums[j++];
        }
        result=Math.max(result,sum);
     }   
     return result;
    }
}