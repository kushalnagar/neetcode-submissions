class Solution {
    public int maxArea(int[] heights) {
        int res=0;

        /*for(int i = 0; i<heights.length; i++){
            for (int j = i+1; j<heights.length; j++){
                res = Math.max(res, Math.min(heights[i], heights[j]) * (j-i));
            }
        }*/

        int left = 0;
        int right = heights.length-1;

        while(left < right){
            res = Math.max(res, Math.min(heights[left], heights[right]) * (right-left));
            if(heights[left] < heights[right]){
                left++;
            } else {
                right--;
            }
        }

        return res;
    }
}
