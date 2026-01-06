class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int count=0;
        long sum=0;
        long least=Long.MAX_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                sum=sum+Math.abs(matrix[i][j]);
                if(matrix[i][j]<0)count++;
                least=Math.min(least,Math.abs(matrix[i][j]));
            }
            

        }
        if(count%2==0)
        {
            return sum;
        }
        else{
            return sum-2*least;
        }
    }
}