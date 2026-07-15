class NumMatrix {

    int[][] matrix;
    int n,m;
    int[][] row_sum;

    public NumMatrix(int[][] matrix) {
       this.matrix=matrix; 
       n=matrix.length;
       m=matrix[0].length;
       row_sum= new int[n][m];
       for (int i=0;i<n;i++){
            int sum=0;
            for (int j=0;j<m;j++){
                sum+=matrix[i][j];
                row_sum[i][j]=sum;
            }
       }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int row_min= Math.min(row1,row2);
        int row_max=Math.max(row1,row2);
        int col_max= Math.max(col1,col2);
        int col_min=Math.min(col1,col2);
        int res=0;
        for (int i=row_min;i<=row_max;i++){
            int val=row_sum[i][col_max];
            // System.out.print(i+" -- "+col_max+" : "+val+" Minus: ");
            int new_r=col_min-1,minus=0;
            if (new_r>=0){minus=row_sum[i][new_r];}
            val-=minus;
            // System.out.println(minus);
            res+=val;
        }
        return res;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */