/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> previousValueByIndex = new HashMap();
        for (int i = 0; i < nums.length; i++){
            if(previousValueByIndex.containsKey((Integer) (target - nums[i]))) {
                return new int[]{ (int) previousValueByIndex.get(target - nums[i]), i};        
            }
            previousValueByIndex.put(nums[i], i);
        }
        return new int[0];
    }
}
