class Solution {
    public int characterReplacement(String s, int k) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        
        int left = 0;
        int right = 0;
        int maxCount = 0;
        int[] count = new int[26];
        int maxLength = 0;
        
        while(right < s.length()) {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);
            
            while((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        
        return maxLength;
        
    }
}
