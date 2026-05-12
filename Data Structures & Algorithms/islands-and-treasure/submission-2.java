class Solution {

    public int solve(int i,int j, int n,int m,int[][] vis,int[][] dp,int[][] grid){

        if (i<0 || i>=n || j<0 || j>=m ){return Integer.MAX_VALUE;}
        if (grid[i][j]==-1){return Integer.MAX_VALUE;}

        if (grid[i][j]==0){return 0;}
        
        if (vis[i][j]==1){
            return Integer.MAX_VALUE;
        }
        // if (dp[i][j]!=-1){return dp[i][j];}
        

        vis[i][j]=1;
        int[] x= new int[]{0,0,1,-1};
        int[] y = new int[]{1,-1,0,0};
        int res=Integer.MAX_VALUE;
        for (int ind=0;ind<4;ind++){
            int p_x=i+x[ind];
            int p_y=j+y[ind];
            int next=solve(p_x,p_y,n,m,vis,dp,grid);
            if (next!=Integer.MAX_VALUE){
                res=Math.min(1+next,res);
            }

        }
        vis[i][j]=0;
        dp[i][j]=res;
        return res;
    }

    public int bfs(int r,int c,int[][] grid){
        int n=grid.length,m=grid[0].length;
        int[] x=new int[]{0,0,1,-1};
        int[] y=new int[]{1,-1,0,0};
        int res=0;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{r,c});
        visited[r][c]=true;
        while (!q.isEmpty()){
                int size=q.size();
              
                // System.out.println("size: "+size);
                for (int i=0;i<size;i++){
                    int[] curr = q.poll();
                    // System.out.println(curr[0]+" "+curr[1]);
                    if (grid[curr[0]][curr[1]]==0){return res;}
                    for (int j=0;j<4;j++){
                        int p_x=curr[0]+x[j],p_y=curr[1]+y[j];
                        if (p_x>=0 && p_x<n && p_y>=0 && p_y<m && !visited[p_x][p_y] && grid[p_x][p_y]!=-1){
                            q.add(new int[]{p_x,p_y});
                            // System.out.println(p_x+" --  "+p_y);
                            visited[p_x][p_y]=true;
                      }
                    }
                }
                res++;
        }
        return Integer.MAX_VALUE;


    }


    public void islandsAndTreasure(int[][] grid) {
        int n=grid.length,m=grid[0].length;

        int[][] vis = new int[n][m];

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (grid[i][j]==2147483647){
                    grid[i][j]=bfs(i,j,grid);
                }
            }
        }
        
    }
}
