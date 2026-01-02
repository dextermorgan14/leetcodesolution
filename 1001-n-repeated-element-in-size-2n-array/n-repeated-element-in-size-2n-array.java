class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int targetCount = nums.length/2;

        for (var entry : map.entrySet()) {
            if (entry.getValue() == targetCount) {
             return entry.getKey();
    }
}

    return -1;

    }
}