class Solution {
    public int findMin(int[] nums) {
    if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is null or empty");
        }

        int left = 0;
        int right = nums.length - 1;

        // If the array is not rotated (the smallest element is the first element)
        if (nums[left] < nums[right]) {
            return nums[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if(nums[mid]> nums[mid+1]){
                return nums[mid+1];
            }
            // Check if mid element is greater than the rightmost element
            if (nums[mid] > nums[right]) {
                // The minimum must be in the right half
                left = mid + 1;
            } else {
                // The minimum could be the mid element or in the left half
                right = mid;
            }
        }

        // At the end of the loop, left == right and points to the smallest element
        return nums[left];
    }
}
