class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq  = new PriorityQueue<>(Collections.reverseOrder());
        int n=nums.length;
        int[] res = new int[n-k+1];
        if (k==0){return res;}
        for (int i=0;i<k;i++){
            pq.offer(nums[i]);
        }
        int ind=0;
        res[ind++]=pq.peek();
        for (int i=k;i<n;i++){
            pq.remove(nums[i-k]);
            pq.offer(nums[i]);
            res[ind++]=pq.peek();
        }
        return res;


    }
}
