class Solution {


    public int solve(int i,int j, int n, int m,int[][] vis,int[][] grid ){

        if (i<0 || i>=n || j<0 || j>=m){return 0;}
        if (grid[i][j]==0){return 0;}
        if (vis[i][j]!=-1){return 0;}
        vis[i][j]=1;
        int[] x= new int[]{0,0,1,-1};
        int[] y= new int[]{1,-1,0,0};
        int res=0;

        for (int ind=0;ind<4;ind++){
            int point_x=i+x[ind],point_y=j+y[ind];
            if (point_x<0 || point_x>=n){res++;continue;}
            if (point_y<0 || point_y>=m){res++;continue;}
            if (grid[point_x][point_y]==0){res++;}
            
            res+=solve(point_x,point_y,n,m,vis,grid);
        }
        return res;



    }

    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[][] vis = new int[n][m];

        for (int i=0;i<n;i++){
            Arrays.fill(vis[i],-1);
        }

        int i1=-1,j1=-1;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (grid[i][j]==1){i1=i;j1=j;break;}
            }
        }
        if (i1==-1 || j1==-1){return 0;}
        return solve(i1,j1,n,m,vis,grid);
        
    }
}