class Solution {


    public int solve(int i,int j,int n,int m,int[][] vis,int[][] grid){

        if (i<0 || i>=n || j<0 || j>=m){return 0;}
        if (grid[i][j]==0){return 0;}
        if (vis[i][j]!=0){return 0;}

        int[] x=new int[]{0,0,1,-1};
        int[] y = new int[]{1,-1,0,0};
        vis[i][j]=1;
        int res=1;
        for (int ind=0;ind<4;ind++){
            int p_x=i+x[ind],p_y=j+y[ind];
            res+=solve(p_x,p_y,n,m,vis,grid);
        }
        return res;
    }


    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[][] vis = new int[n][m];
        int res=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (grid[i][j]==1 && vis[i][j]==0){
                    res=Math.max(res,solve(i,j,n,m,vis,grid));
                }
            }
        }
        return res!=Integer.MIN_VALUE?res:0;


        
    }
}
