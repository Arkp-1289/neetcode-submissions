class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for (int i=0;i<9;i++){
            int[] rows= new int[10];
            int[] cols= new int[10];
            for (int j=0;j<9;j++){
                int row_val=board[i][j]-'0';
                int col_val= board[j][i]-'0';
                if (board[i][j]=='.'){row_val=0;rows[row_val]=0;}
                 if (board[j][i]=='.'){col_val=0;cols[col_val]=0;}
                // System.out.println(i+" "+j);
                // System.out.println(board[i][j]+" : "+board[j][i]);
                if (rows[row_val]==1 || cols[col_val]==1){return false;}
                rows[row_val]=1;
                cols[col_val]=1;
            }
        }

        for (int i=0;i<9;i+=3){

            for (int j=0;j<9;j+=3){
                int[] box= new int[10];
                for (int i1=i;i1<i+3;i1++){
                    for (int j1=j;j1<j+3;j1++){
                        int val=board[i1][j1]-'0';
                        if (board[i1][j1]=='.'){continue;}
                        if (box[val]==1){return false;}
                        box[val]=1;
                    }
                }
            }

        }
        return true;
    }
}
