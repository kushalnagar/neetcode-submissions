class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum =0;

        for (int num : nums){
            if(currentSum < 0){
                currentSum = 0;
            }

            currentSum = currentSum + num;
            if(currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }
        }
        return maxSoFar;
    }
}
