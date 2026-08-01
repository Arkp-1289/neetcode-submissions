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
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = intervals.size();

        Collections.sort(intervals,(a,b)->{
            if (a.start==b.start){
                return Integer.compare(b.end,a.end);
            }
            return Integer.compare(a.start,b.start);
        });
        
        int count=0;

        for (int i=0;i<n;i++){
            int start1 = intervals.get(i).start;
            int end1=intervals.get(i).end;
            if (!pq.isEmpty()){
                if (pq.peek()>start1){
                    // System.out.println(count+" >: "+pq.peek());
                    count++;}
                else{
                    // System.out.println(count+" : "+pq.peek());
                    pq.poll();}
            } else{
                count++;
            }
            pq.add(end1);
        }
        return count;

    }
}
