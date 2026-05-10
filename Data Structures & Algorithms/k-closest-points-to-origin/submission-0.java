class Solution {
    public int[][] kClosest(int[][] points, int k) {

        int n=points.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
        int[][] res = new int[k][2];

        for (int i=0;i<n;i++){
            pq.offer(new int[]{(points[i][0]*points[i][0])+(points[i][1]*points[i][1]),i});
            if (pq.size()>k){
                pq.poll();
            }
        }

        int ind=0;
        while (!pq.isEmpty()){
            int[] p= pq.poll();
            // System.out.println(p[0]+" "+p[1]);
            res[ind][0]=points[p[1]][0];
            res[ind][1]=points[p[1]][1];
            ind++;
        }
        return res;
        

    }
}
