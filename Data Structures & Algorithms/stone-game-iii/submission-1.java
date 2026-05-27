class Solution {
    
    int alice_score=0,bob_score=0;

    int[] dp ;
    public int solve(int ind, int n , int alice,int[] arr){

        if (ind>=n){return 0;}
        if (dp[ind]!=-1){return dp[ind];}
        // int alice_score=0,bob_score=0;

            int one=Integer.MIN_VALUE,two=Integer.MIN_VALUE,three=Integer.MIN_VALUE;
            one=arr[ind]-solve(ind+1,n,0,arr);
            if (ind+1<n){
                two=arr[ind]+arr[ind+1]-solve(ind+2,n,0,arr);
            }
            if (ind+2<n){
                three=arr[ind]+arr[ind+1]+arr[ind+2]-solve(ind+3,n,0,arr);
            }
            alice_score=Math.max(one,Math.max(two,three));
            dp[ind]=alice_score;
        
        return alice_score;
    }


    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        dp= new int[n];
        Arrays.fill(dp,-1);
        int res= solve(0,n,1,stoneValue);
        System.out.println(alice_score+" "+bob_score);
        if (res==0){return "Tie";}
        if (res>0){return "Alice";}
        return "Bob";
    }
}