class Solution {

    public boolean solve(int ind,int side_l,int[] arr,int[] side){


        if (ind==arr.length){return true;}

        for (int i=0;i<4;i++){
            if (side[i]+arr[ind]<=side_l){
                side[i]+=arr[ind];
                if (solve(ind+1,side_l,arr,side)){return true;}
                side[i]-=arr[ind];
            }

        }
        return false;
    }



    public boolean makesquare(int[] arr) {
        int perim=0,n=arr.length;
        for (int i=0;i<n;i++){
            perim+=arr[i];
        }
        if (perim%4!=0){return false;}
        int side_l=perim/4;
        int[] side = new int[4];
        return solve(0,side_l,arr,side);
        
    }
}