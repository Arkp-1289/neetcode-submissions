class Solution {

    public int solve(int num,int n, int target){

        if (num>n){return 0;}
        if (target==0){return 1;}
        if (target<0){return 0;}
        // System.out.println(num);
        int pick = num*(solve(num,n,target-num));
        int npick = solve(num+1,n,target);
        return Math.max(pick,npick);
    }

    public int integerBreak(int n) {
        return solve(1,n-1,n);
        
    }
}