class Solution {
    public static void swap(int a,int b)
    {
        int t=a;
        a=b;
        b=t;
    }
    public void moveZeroes(int[] nums) {
    int j=-1;
    for(int i=0;i<nums.length;i++)
      {
        
        if(nums[i]==0)
        {
            j=i;
            break;
        }
      }  
      if(j==-1)return;

      for(int i=j+1;i<nums.length;i++)
      {
        if(nums[i]!=0)
        {
            int t=nums[j];
            nums[j]=nums[i];
            nums[i]=t;
            j++;
        }
      }
    }
}