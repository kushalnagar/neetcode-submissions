class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        int zeroCount = 0;
        for(int num: nums){
            if(num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }

        if(zeroCount>1){
            return new int[nums.length]; // If more than one zero, all products will be zero
        }

        for(int i = 0; i< nums.length; i++){
            if(zeroCount > 0) {
                result[i] = (nums[i] == 0) ? product : 0; // If current element is zero, use product, else zero
            } else {
                result[i] = product / nums[i]; // If no zeros, divide product by current element
            }
        }
        return result;
    }
}  
