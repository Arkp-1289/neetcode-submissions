class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n=stones.length;
        for (int i=0;i<n;i++){
            pq.offer(stones[i]);
        }
        while (pq.size()>1){
            int maxi=pq.poll();
            int mini=pq.poll();
            if (maxi!=mini){pq.offer(maxi-mini);}
        }
        if (pq.size()>0){return pq.poll();}
        return 0;
    }
}
