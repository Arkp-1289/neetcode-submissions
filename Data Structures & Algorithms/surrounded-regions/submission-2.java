class Solution {
    int[][] dir= new int[][]{{0,1},{0,-1},{1,0},{-1,0}};

    public boolean bfs(int i, int j ,int n, int m, char[][] b){
        Queue<int[]> q = new ArrayDeque<>();
        int[][] vis = new int[n][m];
        q.add(new int[]{i,j});
        vis[i][j]=1;
        Queue<int[]> invert = new ArrayDeque<>();
        while (!q.isEmpty()){
            int size=q.size();
            for (int ind=0;ind<size;ind++){
                int[] curr = q.poll();
                invert.add(curr);
                int x=curr[0],y=curr[1];
                for (int k=0;k<4;k++){
                    int new_x=x+dir[k][0],new_y=y+dir[k][1];
                    if (new_x<0 || new_x>=n || new_y<0 || new_y>=m){return false;}
                    if (b[new_x][new_y]=='O' && vis[new_x][new_y]==0){
                        q.add(new int[]{new_x,new_y});
                        vis[new_x][new_y]=1;
                    }
                }

            }
        }
        while (!invert.isEmpty()){
            int[] curr= invert.poll();
            b[curr[0]][curr[1]]='X';
        }
        return true;

    }


    public void solve(char[][] b) {

        int n=b.length,m=b[0].length;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++){
                if (b[i][j]=='O'){
                    if (bfs(i,j,n,m,b)){
                        b[i][j]='X';
                    }
                }
            }
        }
        
    }
}
