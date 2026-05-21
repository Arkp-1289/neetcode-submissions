class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<int[]> q = new ArrayDeque<>();
        
        int n=grid.length,m=grid[0].length;
        int fresh=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (grid[i][j]==2){
                    q.add(new int[]{i,j});
                } else if (grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int[] x= new int[]{0,0,1,-1};
        int[] y= new int[]{1,-1,0,0};

        int res=0;
        while (fresh!=0  && !q.isEmpty()){
            
            int size = q.size();
            // System.out.println(size);
            for (int i=0;i<size;i++){
                int[] point= q.poll();
                int p_r=point[0],p_c=point[1];
                for (int j=0;j<4;j++){
                    int n_r=p_r+x[j],n_c=p_c+y[j];
                    if (n_r>=0 && n_r<n && n_c>=0 && n_c<m && grid[n_r][n_c]==1){
                        q.add(new int[]{n_r,n_c});
                        grid[n_r][n_c]=2;
                        fresh--;
                    }
                }        
            }
            res++;
        }
        return fresh<=0?res:-1;

        
    }
}
