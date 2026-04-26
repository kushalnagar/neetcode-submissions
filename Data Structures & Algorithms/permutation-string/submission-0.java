class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1 == null || s2 == null || s1.length() > s2.length()){
            return false;
        }

        int[] count = new int[26];

        for (char c: s1.toCharArray()){
            count[c-'a']++;
        }

        int left = 0, right=0, required = s1.length();

        while(right < s2.length()){
            char rightchar = s2.charAt(right);

            if(count[rightchar -'a'] > 0) {
                required--;
            }
            count[rightchar-'a']--;
            right++;

            if(required == 0) {
                return true;
            }

            if(right-left == s1.length()){
                char leftchar = s2.charAt(left);
                if(count[leftchar -'a'] >= 0) {
                    required++;
                }
                count[leftchar -'a']++;
                left++;
            }
        }
        return false;
    }

}
