class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap();

        for (String s: strs) {
            String sa = arrangeInAscendingOrder(s);
            List<String> tl = map.getOrDefault(sa, new ArrayList<String>());
            tl.add(s);
            map.put(sa, tl);
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> l : map.values()){
            result.add(l);
        }
        return result;
    }

    public static String arrangeInAscendingOrder(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();
        
        // Sort the character array
        Arrays.sort(charArray);
        
        // Convert the sorted array back to a string
        return new String(charArray);
    }
}

