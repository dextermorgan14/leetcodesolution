class Solution {
    public boolean isArraySpecial(int[] nums) {
     int n= nums.length;
     int k=1;
     if(n==1)return true;
     for(int i =0;i<n-1;i++)
     {
        if(nums[i]%2==0 && nums[k]%2==0)return false;
        else if (nums[i]==nums[k])return false;
        else if(nums[i]%2!=0 && nums[k]%2!=0)return false;
        
        k++;
     }  
     return true;
    }
}