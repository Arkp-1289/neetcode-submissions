class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;

        int l=0,r=n-1;

        while (l<=r){

            int mid=(l+r)/2;
            if (matrix[mid][m-1]==target){return true;}
            if (matrix[mid][m-1]>target){
                r=mid-1;
            } else{
                l=mid+1;
            }
        }
        int row=l;
        if (row>=n){return false;}

        int left=0,right=m-1;

        while (left<=right){
            int midd=(left+right)/2;
            if (matrix[row][midd]==target){return true;}
            if (matrix[row][midd]>target){
                right=midd-1;
            } else{
                left=midd+1;
            }
        }
        return false;
        
    }
}
