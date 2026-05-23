class Solution {

    public boolean bfs(int i,int j , int n,int m,int[][] h){

        Queue<int[]> q = new ArrayDeque<>();
        boolean pacific =false, atlantic=false;
        q.add(new int[]{i,j});
        if (i==0 || j==0){pacific=true;}
        if (i==n-1 || j==m-1){atlantic=true;}
        int[][] vis = new int[n][m];
        vis[i][j]=1;
        int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        while (!q.isEmpty() && (!pacific || !atlantic)){
            int size=q.size();
            for (int ind=0;ind<size;ind++){
                int[] point = q.poll();
                int x=point[0],y=point[1];
                for (int k=0;k<4;k++){
                    int n_x=x+dir[k][0];
                    int n_y=y+dir[k][1];
                    if (n_x>=0 && n_x<n && n_y>=0 && n_y<m && h[x][y]>=h[n_x][n_y] && vis[n_x][n_y]==0){
                        q.add(new int[]{n_x,n_y});
                        if (n_x==0 || n_y==0){pacific=true;}
                        if (n_x==n-1 || n_y==m-1){atlantic=true;}
                        vis[n_x][n_y]=1;
                    }
                }
            }

        }
        return  (pacific && atlantic)?true:false;

    }



    
    public List<List<Integer>> pacificAtlantic(int[][] h) {
        List<List<Integer>> res= new ArrayList<>();
        int n=h.length,m=h[0].length;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (bfs(i,j,n,m,h)){
                    res.add(List.of(i,j));
                }
            }
        }
        return res;
        
        
    }
}
