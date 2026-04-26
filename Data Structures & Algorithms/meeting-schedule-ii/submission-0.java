/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        int[] start = new int[n];
        int[] end = new int[n];

        int i =0;
        for (Interval in : intervals) {
            start[i] = in.start;
            end[i] = in.end;
            i++;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int res = 0, count=0, s =0, e=0;

        while(s < n){
            if(start[s] < end[e]){
                count++;
                s++;
            } else {
                count--;
                e++;
            }

            res = Math.max(res, count);
        }

        return res;
    }
}
