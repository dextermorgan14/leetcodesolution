class Solution {
    public int[] leftmax(int[] height, int n)
    {
        int[] leftmaxx=new int[n];
        leftmaxx[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftmaxx[i]=Math.max(leftmaxx[i-1],height[i]);
        }
        return leftmaxx; 
    }
    public int[] rightmax(int[] height, int n)
    {
        int[] rightmaxx=new int[n];
        rightmaxx[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmaxx[i]=Math.max(rightmaxx[i+1],height[i]);
        }
        return rightmaxx; 
    }
    
    public int trap(int[] height) {
        int n=height.length;
        int[] leftMax=leftmax(height,n);
        int [] rightMax=rightmax(height,n);

        int sum=0;
        for(int i=0;i<n;i++)
        {
            int h=Math.min(leftMax[i],rightMax[i])-height[i];
            sum+=h;
        }
        return sum;
    }
}