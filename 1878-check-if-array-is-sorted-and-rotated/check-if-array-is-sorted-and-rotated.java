class Solution {
    public boolean check(int[] nums) {
       int size=nums.length; 
      int peak=0;
      for(int i=0;i<size;i++)
      {
        if(nums[i]>nums[(i+1)%size])peak++;
      }  
      if(peak==1 || peak==0)return true;
      return false;
    }
}