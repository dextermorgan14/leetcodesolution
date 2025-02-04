class Solution {
    public int maxAscendingSum(int[] nums) {

    int n=nums.length;
    int result=0;
    int sum=nums[0];

    for(int i=1;i<n;i++)
    {
        if(nums[i]>nums[i-1])
        {
            sum+=nums[i];
            result=Math.max(result,sum);
        }
        else 
        {
            result=Math.max(result,sum);
            sum=nums[i];
        }

    }  
    return Math.max(result,sum);
    }
}