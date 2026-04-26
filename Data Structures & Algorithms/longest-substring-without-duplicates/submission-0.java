class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int[] charIndexMap = new int[128];
        int n = s.length();

        while (right < n){
            char currentChar = s.charAt(right);
            left = Math.max(left, charIndexMap[currentChar]);
            charIndexMap[currentChar] = right + 1;
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }
}
