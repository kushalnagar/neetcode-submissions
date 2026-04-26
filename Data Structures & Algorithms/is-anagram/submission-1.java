class Solution {
    public boolean isAnagram(String s, String t) {
if(s.length() != t.length()) {
            return false;
        }

        java.util.HashMap<Character, Integer> charCount = new java.util.HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        int count = s.length();
        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
            count--;
        }
        if (count != 0) {
            return false;
        }
        return true;
    }
}
