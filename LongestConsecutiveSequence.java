/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
*/
class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> valueByCountMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            Integer currentValue = nums[i];
            Integer sequenceValue = null;
            if (valueByCountMap.containsKey(currentValue)) {
                continue;
            }
            if (valueByCountMap.containsKey(currentValue-1)) {
                sequenceValue = valueByCountMap.get(currentValue-1) + 1;
                result = Math.max(result, sequenceValue);
            }
            if (valueByCountMap.containsKey(currentValue+1)) {
                if (sequenceValue != null) {
                    sequenceValue = valueByCountMap.get(currentValue+1) + sequenceValue;  
                } else {
                    sequenceValue = valueByCountMap.get(currentValue+1) + 1;
                }
                result = Math.max(result, sequenceValue);
            }
        }


        return result;
    }
}
