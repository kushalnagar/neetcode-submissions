class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> initialSet = new HashSet<>();
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums){
            if(num != Integer.MIN_VALUE && !initialSet.contains(num-1)) { // Handle edge case for Integer.MIN_VALUE
                initialSet.add(num);
                numSet.add(num);
            } else if (initialSet.contains(num-1)){
                numSet.add(num);
            }
        }   
        int longestStreak = 0;

        for (Integer num : initialSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
