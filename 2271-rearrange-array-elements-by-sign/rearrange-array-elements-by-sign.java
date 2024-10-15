class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] positives = new int[nums.length / 2 + nums.length % 2];
        int[] negatives = new int[nums.length / 2];
        
        // Separate positive and negative numbers
        int posIndex = 0, negIndex = 0;
        for (int num : nums) {
            if (num < 0) {
                negatives[negIndex++] = num;
            } else {
                positives[posIndex++] = num;
            }
        }
        
        // Merge positive and negative numbers
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = positives[i / 2];
            } else {
                nums[i] = negatives[i / 2];
            }
        }
        return nums;
 
    }
}