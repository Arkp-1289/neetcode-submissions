class Solution {

    int[][] vis ;

      public void solve(int i,int j, int n, int m,char[][] grid ){
        if (i<0 || i>=n || j<0 || j>=m){return ;}
        if (grid[i][j]=='0'){return;}
        if (vis[i][j]!=-1){return;}

        vis[i][j]=1;
        int[] x= new int[]{0,0,1,-1};
        int[] y= new int[]{1,-1,0,0};
    
        for (int ind=0;ind<4;ind++){
            int point_x=i+x[ind],point_y=j+y[ind];
            solve(point_x,point_y,n,m,grid);
        }
        return;
    }

    public int numIslands(char[][] grid) {
            int n=grid.length;
        int m=grid[0].length;
        vis=new int[n][m];
        for (int i=0;i<n;i++){
            Arrays.fill(vis[i],-1);
        }

        int res=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (grid[i][j]=='1' && vis[i][j]==-1){
                    res++;
                    solve(i,j,n,m,grid);
                }
            }
        }
   
        return res;
    }
}
