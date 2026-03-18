class Solution {
    public int maxProfit(int[] prices) {
        int maxpro=0;
        int mincurpro=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            mincurpro=Math.min(mincurpro,prices[i]);
            maxpro=Math.max(maxpro,prices[i]-mincurpro);

        }
        return maxpro;
    }
}