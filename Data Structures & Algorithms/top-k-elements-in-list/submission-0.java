class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1])); 
       Map<Integer,Integer> mp = new HashMap<>();
       int n= nums.length;
       for (int i=0;i<n;i++){
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
       }

       for (int i:mp.keySet()){
        pq.offer(new int[]{i,mp.get(i)});
       }
       int[] res = new int[k];

       for (int i=0;i<k;i++){
            res[i]=pq.poll()[0];
       }
       return res;
    }
}
