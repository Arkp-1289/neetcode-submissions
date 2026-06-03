class Solution {
    public int hammingWeight(int n) {
        int res=0;
        while (n>0){
            int r=n%2;
            if (r==1){res++;}
            n=n/2;

        }
        return res;
    }
}
