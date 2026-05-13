class Solution {

    public int solve(int i,int n,String s,int[] dp){
        if (i>=n){return 1;}
        if (dp[i]!=-1){return dp[i];}
        if (s.charAt(i)=='0'){return 0;}
        
        int one=0,two=0;
         one = solve(i+1,n,s,dp);
        if (i+1<n && Integer.parseInt(""+s.charAt(i)+s.charAt(i+1))<27){
             two=solve(i+2,n,s,dp);
        }
        dp[i]=one+two;
        return one+two;

    }


    public int numDecodings(String s) {
        int n=s.length();
         int[] dp = new int[n];
         Arrays.fill(dp,-1);
       int res= solve(0,n,s,dp);
      
        if (res==Integer.MAX_VALUE){return 0;}
        return res;
    }
}
