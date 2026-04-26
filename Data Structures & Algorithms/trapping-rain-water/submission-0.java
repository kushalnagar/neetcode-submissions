class Solution {
    public int trap(int[] heights) {
       if (heights == null || heights.length == 0) {
            return 0;
        }

        int l = 0;
        int r = heights.length - 1;
        int leftMax = heights[l];
        int rightMax = heights[r];

        int res = 0;
        while(l<r){
            if(leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, heights[l]);
                res += leftMax - heights[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, heights[r]);
                res += rightMax -heights[r];
            }
        }
        return res; 
    }
}
